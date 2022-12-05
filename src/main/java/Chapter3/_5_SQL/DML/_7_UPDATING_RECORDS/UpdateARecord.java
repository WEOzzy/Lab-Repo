package Chapter3._5_SQL.DML._7_UPDATING_RECORDS;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Now that we know how to insert and remove records from a table, we are going to learn how to update a record.
 * To update a record we utilize the UPDATE keyword which is a part of the DML sublanguage.
 *
 * The syntax for updating a record is as follows:
 * UPDATE table_name SET col_1 = val_1 WHERE condition
 *
 * NOTE: The WHERE condition is important because if you leave this out, that column will be updated throughout all of the records in the table.
 *
 * Additional Resource if needed: https://www.w3schools.com/sql/sql_update.asp
 *
 *
 * For the problems below, we will be utilizing the following table.
 *      users table:
 *      |   id  |     firstname        |        lastname        |
 *      ----------------------------------------------------------
 *      |1      |'Steve'               |'Garcia'                |
 *      |2      |'Alexa'               |'Smith'                 |
 *      |3      |'Steve'               |'Jones'                 |
 *      |4      |'Brandon'             |'Smith'                 |
 *      |5      |'Adam'                |'Jones'                 |
 */
public class UpdateARecord {

    /**
     * Problem 1: Update Alexa's last name to be 'Rush' in the users table.
     */
    public void problem1(){
        //Write SQL statement here
        String sql = "UPDATE users " +
                "SET lastname = 'Rush'" +
                "WHERE firstname = 'Alexa';";

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Problem 2: Update id 4 to have the firstname 'Chad' and the lastname 'Irving'
     */
    public void problem2(){
        //Write SQL statement here
        String sql = "UPDATE users " +
                "SET firstname = 'Chad', lastname = 'Irving'" +
                "WHERE id = 4;";

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Problem 3: Update id 1 and 3 to have the firstname 'Steven'
     *
     * HINT: How would you filter id 1 OR 3?
     */
    public void problem3(){
        //Write SQL statement here
        String sql = "UPDATE users " +
                "SET firstname = 'Steven'" +
                "WHERE id = 1 OR id = 3;";

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
