package com.backend;

/**
 * Created by surverules on 11/6/2016.
 */
public class Address {

    private ADDRESS ADDRESS;

    private String MYNAME;

    private String SPOUSE_NAME;

    public ADDRESS getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(ADDRESS ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getMYNAME() {
        return MYNAME;
    }

    public void setMYNAME(String MYNAME) {
        this.MYNAME = MYNAME;
    }

    public String getSPOUSE_NAME() {
        return SPOUSE_NAME;
    }

    public void setSPOUSE_NAME(String SPOUSE_NAME) {
        this.SPOUSE_NAME = SPOUSE_NAME;
    }

    @Override
    public String toString() {
        return "ClassPojo [ADDRESS = " + ADDRESS + ", MYNAME = " + MYNAME + ", SPOUSE NAME = " + SPOUSE_NAME + "]";
    }

    class ADDRESS {
        private String STATE;

        private String APT_NO;

        private String CITY;

        private String STREET;

        public String getSTATE() {
            return STATE;
        }

        public void setSTATE(String STATE) {
            this.STATE = STATE;
        }

        public String getAPT_NO() {
            return APT_NO;
        }

        public void setAPT_NO(String APT_NO) {
            this.APT_NO = APT_NO;
        }

        public String getCITY() {
            return CITY;
        }

        public void setCITY(String CITY) {
            this.CITY = CITY;
        }

        public String getSTREET() {
            return STREET;
        }

        public void setSTREET(String STREET) {
            this.STREET = STREET;
        }

        @Override
        public String toString() {
            return "ClassPojo [STATE = " + STATE + ", APT_NO = " + APT_NO + ", CITY = " + CITY + ", STREET = " + STREET + "]";
        }
    }
}

