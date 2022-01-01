package com.inventory.dao;

import com.inventory.common.ICommonInterface;
import com.inventory.model.Product;
import com.inventory.util.DBConnection;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sabbir
 */
public class ProductDAO implements ICommonInterface<Product>{
    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Product t) {
        String sql = "insert into product (product_code, product_name, category_code, category_name, product_attributes) values (?, ?, ?, ?, ?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            System.out.println(t.getProductName());
            ps.setString(1, t.getProductCode());
            ps.setString(2, t.getProductName());
            ps.setString(3, t.getCategoryCode());
            ps.setString(4, t.getCategoryName());
            ps.setString(5, t.getProductAttribute());
            status = ps.executeUpdate();
        } catch (Exception e) {
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
    }

    @Override
    public Product edit(Product t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Product t) {
            String sql = "delete from product where product_code = ?";
            int status =0;
            try {
                PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
                status = ps.executeUpdate();
                ps.setString(1, t.getProductCode());
            } catch (SQLException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }   
            return status;
 
    }

    @Override
    public Product getbyCode(int code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getAll() {
        String sql = "select * from product";
        List<Product> products = new ArrayList<Product>(); 
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next()){
                Product product = new Product();
                product.setProductCode(rs.getString("product_code"));
                product.setProductName(rs.getString("product_name"));
                product.setCategoryCode(rs.getString("category_code"));
                product.setCategoryName(rs.getString("category_name"));
                product.setProductAttribute(rs.getString("product_attributes"));
                products.add(product);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    @Override
    public int update(Product t) {
        String sql = "update product set product_code = ?, product_name = ?, category_code = ?, category_name =?, product_attributes = ? where product_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getProductCode());
            ps.setString(2, t.getProductName());
            ps.setString(3, t.getCategoryName());
            ps.setString(4, t.getCategoryCode());
            ps.setString(5, t.getProductAttribute());
            ps.setString(6, t.getProductCode());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
    }
    
}
