package com.gf.entity;


import java.io.Serializable;

public class UserAddress implements Serializable{

    private static final long serialVersionUID = -1220870792073689661L;

    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String isDefault;

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( "{\"UserAddress\":{" );
        sb.append( "\"id\":" )
                .append( id );
        sb.append( ",\"userAddress\":\"" )
                .append( userAddress ).append( '\"' );
        sb.append( ",\"userId\":\"" )
                .append( userId ).append( '\"' );
        sb.append( ",\"consignee\":\"" )
                .append( consignee ).append( '\"' );
        sb.append( ",\"isDefault\":\"" )
                .append( isDefault ).append( '\"' );
        sb.append( "}}" );
        return sb.toString();
    }

}
