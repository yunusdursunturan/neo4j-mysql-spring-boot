package com.example.relational.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(schema = "moo_company_companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nsehir;
    private String nad;
    private Long user_id;
    private String avatar;
    private String cover;
    private Timestamp created;
    private Long verified;
    private Long lonaktrust;
    private String page_url;
    private Long nhesapturu;
    private Long odeme;
    private Long aktivite;
    private String ntelefon;
    private String nyetkili;
    private String nweb;
    private String nfax;
    private String nadres;
    private String npostakodu;
    private Long refer1;
    private Long refer2;
    private Long refer3;
    private Long refer4;
    private String username;
    private Long product_limit;
    private Double lat;
    private Double lng;
    private String nulke;
    private String code;
    private String email_active;
    private Long rekdurum;
    private Long plan_id;
    private Timestamp nbitistarihi;
    private Long nmemtype;
    private Long monthlypostread;
    private Long vatno_validate;
    private String nvergi;
    private Long aylikteklif;
    private Long girissayisi;
    private Timestamp songiris;
    private String sonip;
    private Timestamp songuncel;
    private Long ualojistik;
    private Long yilojistik;
    private String tanitimyazi;
    private Long mailal;
    private Long karaal;
    private Long denizal;
    private Long havaal;
    private Long demiral;
    private Long rekfirma;
    private Long humanresources;
    private Long documentapproved;
    private Long points;
    private Long subscribe_id;
    private Long monthlysendoffer;
    private Long notisend_block;
    private String verified_document;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNsehir() {
        return nsehir;
    }

    public void setNsehir(String nsehir) {
        this.nsehir = nsehir;
    }

    public String getNad() {
        return nad;
    }

    public void setNad(String nad) {
        this.nad = nad;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Long getVerified() {
        return verified;
    }

    public void setVerified(Long verified) {
        this.verified = verified;
    }

    public Long getLonaktrust() {
        return lonaktrust;
    }

    public void setLonaktrust(Long lonaktrust) {
        this.lonaktrust = lonaktrust;
    }

    public String getPage_url() {
        return page_url;
    }

    public void setPage_url(String page_url) {
        this.page_url = page_url;
    }

    public Long getNhesapturu() {
        return nhesapturu;
    }

    public void setNhesapturu(Long nhesapturu) {
        this.nhesapturu = nhesapturu;
    }

    public Long getOdeme() {
        return odeme;
    }

    public void setOdeme(Long odeme) {
        this.odeme = odeme;
    }

    public Long getAktivite() {
        return aktivite;
    }

    public void setAktivite(Long aktivite) {
        this.aktivite = aktivite;
    }

    public String getNtelefon() {
        return ntelefon;
    }

    public void setNtelefon(String ntelefon) {
        this.ntelefon = ntelefon;
    }

    public String getNyetkili() {
        return nyetkili;
    }

    public void setNyetkili(String nyetkili) {
        this.nyetkili = nyetkili;
    }

    public String getNweb() {
        return nweb;
    }

    public void setNweb(String nweb) {
        this.nweb = nweb;
    }

    public String getNfax() {
        return nfax;
    }

    public void setNfax(String nfax) {
        this.nfax = nfax;
    }

    public String getNadres() {
        return nadres;
    }

    public void setNadres(String nadres) {
        this.nadres = nadres;
    }

    public String getNpostakodu() {
        return npostakodu;
    }

    public void setNpostakodu(String npostakodu) {
        this.npostakodu = npostakodu;
    }

    public Long getRefer1() {
        return refer1;
    }

    public void setRefer1(Long refer1) {
        this.refer1 = refer1;
    }

    public Long getRefer2() {
        return refer2;
    }

    public void setRefer2(Long refer2) {
        this.refer2 = refer2;
    }

    public Long getRefer3() {
        return refer3;
    }

    public void setRefer3(Long refer3) {
        this.refer3 = refer3;
    }

    public Long getRefer4() {
        return refer4;
    }

    public void setRefer4(Long refer4) {
        this.refer4 = refer4;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getProduct_limit() {
        return product_limit;
    }

    public void setProduct_limit(Long product_limit) {
        this.product_limit = product_limit;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getNulke() {
        return nulke;
    }

    public void setNulke(String nulke) {
        this.nulke = nulke;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail_active() {
        return email_active;
    }

    public void setEmail_active(String email_active) {
        this.email_active = email_active;
    }

    public Long getRekdurum() {
        return rekdurum;
    }

    public void setRekdurum(Long rekdurum) {
        this.rekdurum = rekdurum;
    }

    public Long getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Long plan_id) {
        this.plan_id = plan_id;
    }

    public Timestamp getNbitistarihi() {
        return nbitistarihi;
    }

    public void setNbitistarihi(Timestamp nbitistarihi) {
        this.nbitistarihi = nbitistarihi;
    }

    public Long getNmemtype() {
        return nmemtype;
    }

    public void setNmemtype(Long nmemtype) {
        this.nmemtype = nmemtype;
    }

    public Long getMonthlypostread() {
        return monthlypostread;
    }

    public void setMonthlypostread(Long monthlypostread) {
        this.monthlypostread = monthlypostread;
    }

    public Long getVatno_validate() {
        return vatno_validate;
    }

    public void setVatno_validate(Long vatno_validate) {
        this.vatno_validate = vatno_validate;
    }

    public String getNvergi() {
        return nvergi;
    }

    public void setNvergi(String nvergi) {
        this.nvergi = nvergi;
    }

    public Long getAylikteklif() {
        return aylikteklif;
    }

    public void setAylikteklif(Long aylikteklif) {
        this.aylikteklif = aylikteklif;
    }

    public Long getGirissayisi() {
        return girissayisi;
    }

    public void setGirissayisi(Long girissayisi) {
        this.girissayisi = girissayisi;
    }

    public Timestamp getSongiris() {
        return songiris;
    }

    public void setSongiris(Timestamp songiris) {
        this.songiris = songiris;
    }

    public String getSonip() {
        return sonip;
    }

    public void setSonip(String sonip) {
        this.sonip = sonip;
    }

    public Timestamp getSonguncel() {
        return songuncel;
    }

    public void setSonguncel(Timestamp songuncel) {
        this.songuncel = songuncel;
    }

    public Long getUalojistik() {
        return ualojistik;
    }

    public void setUalojistik(Long ualojistik) {
        this.ualojistik = ualojistik;
    }

    public Long getYilojistik() {
        return yilojistik;
    }

    public void setYilojistik(Long yilojistik) {
        this.yilojistik = yilojistik;
    }

    public String getTanitimyazi() {
        return tanitimyazi;
    }

    public void setTanitimyazi(String tanitimyazi) {
        this.tanitimyazi = tanitimyazi;
    }

    public Long getMailal() {
        return mailal;
    }

    public void setMailal(Long mailal) {
        this.mailal = mailal;
    }

    public Long getKaraal() {
        return karaal;
    }

    public void setKaraal(Long karaal) {
        this.karaal = karaal;
    }

    public Long getDenizal() {
        return denizal;
    }

    public void setDenizal(Long denizal) {
        this.denizal = denizal;
    }

    public Long getHavaal() {
        return havaal;
    }

    public void setHavaal(Long havaal) {
        this.havaal = havaal;
    }

    public Long getDemiral() {
        return demiral;
    }

    public void setDemiral(Long demiral) {
        this.demiral = demiral;
    }

    public Long getRekfirma() {
        return rekfirma;
    }

    public void setRekfirma(Long rekfirma) {
        this.rekfirma = rekfirma;
    }

    public Long getHumanresources() {
        return humanresources;
    }

    public void setHumanresources(Long humanresources) {
        this.humanresources = humanresources;
    }

    public Long getDocumentapproved() {
        return documentapproved;
    }

    public void setDocumentapproved(Long documentapproved) {
        this.documentapproved = documentapproved;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public Long getSubscribe_id() {
        return subscribe_id;
    }

    public void setSubscribe_id(Long subscribe_id) {
        this.subscribe_id = subscribe_id;
    }

    public Long getMonthlysendoffer() {
        return monthlysendoffer;
    }

    public void setMonthlysendoffer(Long monthlysendoffer) {
        this.monthlysendoffer = monthlysendoffer;
    }

    public Long getNotisend_block() {
        return notisend_block;
    }

    public void setNotisend_block(Long notisend_block) {
        this.notisend_block = notisend_block;
    }

    public String getVerified_document() {
        return verified_document;
    }

    public void setVerified_document(String verified_document) {
        this.verified_document = verified_document;
    }
}
