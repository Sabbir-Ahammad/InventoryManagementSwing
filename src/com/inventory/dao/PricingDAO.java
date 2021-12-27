/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.dao;

import com.inventory.common.ICommonInterface;
import com.inventory.model.Pricing;
import com.inventory.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sabbir
 */
public class PricingDAO implements ICommonInterface<Pricing>{
    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Pricing t) {
        String sql = "insert into pricing (pricing_code, vat_rate, discount) values (?,?,?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getPricingCode());
            ps.setString(2, t.getVatRate());
            ps.setString(3, t.getDiscount());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PricingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Pricing edit(Pricing t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Pricing t) {
        String sql = "delete from pricing where pricing_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getPricingCode());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PricingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Pricing getbyCode(int code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pricing> getAll() {
        String sql = "select * from pricing";
        List<Pricing> pricings = new ArrayList<Pricing>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                Pricing showPricing = new Pricing();
                showPricing.setPricingCode(rs.getString("pricing_code"));
                showPricing.setVatRate(rs.getString("vat_rate"));
                showPricing.setDiscount(rs.getString("discount"));
                pricings.add(showPricing);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pricings;
    }

    @Override
    public int update(Pricing t) {
        String sql = "update pricing set pricing_code = ?, vat_rate = ?, discount = ? where pricing_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getPricingCode());
            ps.setString(2, t.getVatRate());
            ps.setString(3, t.getDiscount());
            ps.setString(4, t.getPricingCode());
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
