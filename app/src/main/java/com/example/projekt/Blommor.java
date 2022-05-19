package com.example.projekt;

public class Blommor {

        String name;
        Integer size;
        String company;
        String ID;


        public String getBlomma() {
                return name;
        }

        public void setBlomma(String blomma) {
                this.name = blomma;
        }

        public Integer getSize() {
                return size;
        }

        public void setSize(Integer size) {
                this.size = size;
        }

        public String getCompany() {
                return company;
        }

        public void setCompany(String company) {
                company = company;
        }

        public String getID() {
                return ID;
        }

        public void setID(String ID) {
                this.ID = ID;
        }

        public Blommor(String Name, Integer size, String ID, String company){
                this.name = Name;
                this.size = size;
                this.ID = ID;
                this.company = company;
        }
}
