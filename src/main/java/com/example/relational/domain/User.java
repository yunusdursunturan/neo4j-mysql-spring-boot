package com.example.relational.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(schema = "moo_users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String salt;
    private Long role_id;
    private String avatar;
    private String photo;
    private Timestamp created;
    private Timestamp last_login;
    private Long photo_count;
    private Long friend_count;
    private Long notification_count;
    private Long friend_request_count;
    private Long blog_count;
    private Long topic_count;
    private Long group_count;
    private Long event_count;
    private Long conversation_user_count;
    private Long video_count;
    private String gender;
    private Date birthday;
    private Long active;
    private Long confirmed;
    private String code;
    private Long notification_email;
    private String timezone;
    private String ip_address;
    private Long privacy;
    private String username;
    private String about;
    private Long featured;
    private String lang;
    private Long hide_online;
    private String cover;
    private Long approved;
    private Long is_social;
    private Long has_active_subscription;
    private Long receive_message_from_non_friend;
    private Long send_email_when_send_message;
    private Long request_friend_email;
    private String notification_setting;
    private String user_country;
    private Long nakid;
    private Long comp_match;
    private Long finance;
    private String position;
    private String nad;
    private Long refer1;
    private Long refer2;
    private Long refer3;
    private Long refer4;
    private Long logistics;
    private BigDecimal commission1st;
    private BigDecimal commission2nd;
    private BigDecimal commission3rd;
    private BigDecimal commission4th;
    private Long cangetprofit;
    private Long add_account;
    private Long pageadmin;
    private Long nhesapturu;
    private Long odeme;
    private Long verified;
    private Long lonaktrust;
    private Long aktivite;
    private Long person_count;
    private Long company_count;
    private Long marketplace;
    private String nulke;
    private Long chat_count;
    private Long msgfromverified;
    private Long logistics_read;
    private Long empty_truck;
    private Long rekfirma;
    private Long member_verify;
    private Long company_posting_count;
    private Long quotation;
    private Long humanresources;
    private Long department;
    private Long only_friends_of_my_friends_can_add_me;
    private Long verified_users_can_comment_my_post;
    private Long user_management;
    private Long temporary_nakid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getLast_login() {
        return last_login;
    }

    public void setLast_login(Timestamp last_login) {
        this.last_login = last_login;
    }

    public Long getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(Long photo_count) {
        this.photo_count = photo_count;
    }

    public Long getFriend_count() {
        return friend_count;
    }

    public void setFriend_count(Long friend_count) {
        this.friend_count = friend_count;
    }

    public Long getNotification_count() {
        return notification_count;
    }

    public void setNotification_count(Long notification_count) {
        this.notification_count = notification_count;
    }

    public Long getFriend_request_count() {
        return friend_request_count;
    }

    public void setFriend_request_count(Long friend_request_count) {
        this.friend_request_count = friend_request_count;
    }

    public Long getBlog_count() {
        return blog_count;
    }

    public void setBlog_count(Long blog_count) {
        this.blog_count = blog_count;
    }

    public Long getTopic_count() {
        return topic_count;
    }

    public void setTopic_count(Long topic_count) {
        this.topic_count = topic_count;
    }

    public Long getGroup_count() {
        return group_count;
    }

    public void setGroup_count(Long group_count) {
        this.group_count = group_count;
    }

    public Long getEvent_count() {
        return event_count;
    }

    public void setEvent_count(Long event_count) {
        this.event_count = event_count;
    }

    public Long getConversation_user_count() {
        return conversation_user_count;
    }

    public void setConversation_user_count(Long conversation_user_count) {
        this.conversation_user_count = conversation_user_count;
    }

    public Long getVideo_count() {
        return video_count;
    }

    public void setVideo_count(Long video_count) {
        this.video_count = video_count;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

    public Long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Long confirmed) {
        this.confirmed = confirmed;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getNotification_email() {
        return notification_email;
    }

    public void setNotification_email(Long notification_email) {
        this.notification_email = notification_email;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public Long getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Long privacy) {
        this.privacy = privacy;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Long getFeatured() {
        return featured;
    }

    public void setFeatured(Long featured) {
        this.featured = featured;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Long getHide_online() {
        return hide_online;
    }

    public void setHide_online(Long hide_online) {
        this.hide_online = hide_online;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Long getApproved() {
        return approved;
    }

    public void setApproved(Long approved) {
        this.approved = approved;
    }

    public Long getIs_social() {
        return is_social;
    }

    public void setIs_social(Long is_social) {
        this.is_social = is_social;
    }

    public Long getHas_active_subscription() {
        return has_active_subscription;
    }

    public void setHas_active_subscription(Long has_active_subscription) {
        this.has_active_subscription = has_active_subscription;
    }

    public Long getReceive_message_from_non_friend() {
        return receive_message_from_non_friend;
    }

    public void setReceive_message_from_non_friend(Long receive_message_from_non_friend) {
        this.receive_message_from_non_friend = receive_message_from_non_friend;
    }

    public Long getSend_email_when_send_message() {
        return send_email_when_send_message;
    }

    public void setSend_email_when_send_message(Long send_email_when_send_message) {
        this.send_email_when_send_message = send_email_when_send_message;
    }

    public Long getRequest_friend_email() {
        return request_friend_email;
    }

    public void setRequest_friend_email(Long request_friend_email) {
        this.request_friend_email = request_friend_email;
    }

    public String getNotification_setting() {
        return notification_setting;
    }

    public void setNotification_setting(String notification_setting) {
        this.notification_setting = notification_setting;
    }

    public String getUser_country() {
        return user_country;
    }

    public void setUser_country(String user_country) {
        this.user_country = user_country;
    }

    public Long getNakid() {
        return nakid;
    }

    public void setNakid(Long nakid) {
        this.nakid = nakid;
    }

    public Long getComp_match() {
        return comp_match;
    }

    public void setComp_match(Long comp_match) {
        this.comp_match = comp_match;
    }

    public Long getFinance() {
        return finance;
    }

    public void setFinance(Long finance) {
        this.finance = finance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNad() {
        return nad;
    }

    public void setNad(String nad) {
        this.nad = nad;
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

    public Long getLogistics() {
        return logistics;
    }

    public void setLogistics(Long logistics) {
        this.logistics = logistics;
    }

    public BigDecimal getCommission1st() {
        return commission1st;
    }

    public void setCommission1st(BigDecimal commission1st) {
        this.commission1st = commission1st;
    }

    public BigDecimal getCommission2nd() {
        return commission2nd;
    }

    public void setCommission2nd(BigDecimal commission2nd) {
        this.commission2nd = commission2nd;
    }

    public BigDecimal getCommission3rd() {
        return commission3rd;
    }

    public void setCommission3rd(BigDecimal commission3rd) {
        this.commission3rd = commission3rd;
    }

    public BigDecimal getCommission4th() {
        return commission4th;
    }

    public void setCommission4th(BigDecimal commission4th) {
        this.commission4th = commission4th;
    }

    public Long getCangetprofit() {
        return cangetprofit;
    }

    public void setCangetprofit(Long cangetprofit) {
        this.cangetprofit = cangetprofit;
    }

    public Long getAdd_account() {
        return add_account;
    }

    public void setAdd_account(Long add_account) {
        this.add_account = add_account;
    }

    public Long getPageadmin() {
        return pageadmin;
    }

    public void setPageadmin(Long pageadmin) {
        this.pageadmin = pageadmin;
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

    public Long getAktivite() {
        return aktivite;
    }

    public void setAktivite(Long aktivite) {
        this.aktivite = aktivite;
    }

    public Long getPerson_count() {
        return person_count;
    }

    public void setPerson_count(Long person_count) {
        this.person_count = person_count;
    }

    public Long getCompany_count() {
        return company_count;
    }

    public void setCompany_count(Long company_count) {
        this.company_count = company_count;
    }

    public Long getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Long marketplace) {
        this.marketplace = marketplace;
    }

    public String getNulke() {
        return nulke;
    }

    public void setNulke(String nulke) {
        this.nulke = nulke;
    }

    public Long getChat_count() {
        return chat_count;
    }

    public void setChat_count(Long chat_count) {
        this.chat_count = chat_count;
    }

    public Long getMsgfromverified() {
        return msgfromverified;
    }

    public void setMsgfromverified(Long msgfromverified) {
        this.msgfromverified = msgfromverified;
    }

    public Long getLogistics_read() {
        return logistics_read;
    }

    public void setLogistics_read(Long logistics_read) {
        this.logistics_read = logistics_read;
    }

    public Long getEmpty_truck() {
        return empty_truck;
    }

    public void setEmpty_truck(Long empty_truck) {
        this.empty_truck = empty_truck;
    }

    public Long getRekfirma() {
        return rekfirma;
    }

    public void setRekfirma(Long rekfirma) {
        this.rekfirma = rekfirma;
    }

    public Long getMember_verify() {
        return member_verify;
    }

    public void setMember_verify(Long member_verify) {
        this.member_verify = member_verify;
    }

    public Long getCompany_posting_count() {
        return company_posting_count;
    }

    public void setCompany_posting_count(Long company_posting_count) {
        this.company_posting_count = company_posting_count;
    }

    public Long getQuotation() {
        return quotation;
    }

    public void setQuotation(Long quotation) {
        this.quotation = quotation;
    }

    public Long getHumanresources() {
        return humanresources;
    }

    public void setHumanresources(Long humanresources) {
        this.humanresources = humanresources;
    }

    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }

    public Long getOnly_friends_of_my_friends_can_add_me() {
        return only_friends_of_my_friends_can_add_me;
    }

    public void setOnly_friends_of_my_friends_can_add_me(Long only_friends_of_my_friends_can_add_me) {
        this.only_friends_of_my_friends_can_add_me = only_friends_of_my_friends_can_add_me;
    }

    public Long getVerified_users_can_comment_my_post() {
        return verified_users_can_comment_my_post;
    }

    public void setVerified_users_can_comment_my_post(Long verified_users_can_comment_my_post) {
        this.verified_users_can_comment_my_post = verified_users_can_comment_my_post;
    }

    public Long getUser_management() {
        return user_management;
    }

    public void setUser_management(Long user_management) {
        this.user_management = user_management;
    }

    public Long getTemporary_nakid() {
        return temporary_nakid;
    }

    public void setTemporary_nakid(Long temporary_nakid) {
        this.temporary_nakid = temporary_nakid;
    }
}