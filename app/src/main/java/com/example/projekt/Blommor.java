package com.example.projekt;

public class Blommor {

        String name;
        Integer size;
        String Company;
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
                return Company;
        }

        public void setCompany(String company) {
                Company = company;
        }

        public String getID() {
                return ID;
        }

        public void setID(String ID) {
                this.ID = ID;
        }

        public Blommor(String Name, Integer Size, String ID){
                this.name = Name;
                this.size = Size;
                this.ID = ID;
        }
}
