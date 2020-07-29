package com.belajarJDBC.jdbcTemplate.Kenangan;

public class Mantan {

    private String nama;
    private String levelCantik;

    @Override
    public String toString() {
        return "Mantan{" +
                "nama='" + nama + '\'' +
                ", levelCantik='" + levelCantik + '\'' +
                '}';
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLevelCantik() {
        return levelCantik;
    }

    public void setLevelCantik(String levelCantik) {
        this.levelCantik = levelCantik;
    }
}
