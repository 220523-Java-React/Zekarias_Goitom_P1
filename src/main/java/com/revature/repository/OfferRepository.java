package com.revature.repository;

import com.revature.model.Offer;
import com.revature.util.ConnectionUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfferRepository implements DAO<Offer>{
    @Override
    public Offer create(Offer offer) {
        String sql = "insert into offers(open, approved, rejected, password, id) values(?,?,?,?,?)";

        /*
                This is a Try-With-Resources block
                used when you have resources that have open channels that you need to eventually close

                try with resource WILL automatically close anything that implements the AutoClosable interface
         */
        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql); //, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, offer.getOpen());
            stmt.setString(2, offer.getApproved());
            stmt.setString(3, offer.getRejected());
            stmt.setInt(5, offer.getId());

            int success = stmt.executeUpdate();
           /* ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) {
                int id = keys.getInt(1);
                return offer.setId(id);
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    }

    @Override
    public List<Offer> getAll(){
        // Empty lists of offers, will add any new users from the result set
        List<Offer> offers = new ArrayList<>();
        String sql = "select * from offers";

        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while(results.next()){
                // go through each result, build an offer object for that data, add that offer object to the offers list
                offers.add(new Offer()
                        .setOpen(results.getString("open"))
                        .setApproved(results.getString("approved"))
                        .setRejected(results.getString("rejected"))
                        .setId(results.getInt("id"))

                );
            }


        }catch(SQLException e){
            e.printStackTrace();
        }

        return offers;
    }

    @Override
    public Offer getById(int id) {
        return null;
    }

    @Override
    public Offer update(Offer offer) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

/* might refactor code to use the method below to get all open offers and above
 method to get all offers

    public List<Flashcard> getAllByTopic(Topic topic){
        List<Flashcard> filteredFlashcards = new ArrayList<>();

        for(Flashcard flashcard: flashcards){
            if(flashcard.getTopic().equals(topic)){
                filteredFlashcards.add(flashcard);
            }
        }

        return filteredFlashcards;
    }
*/
}
