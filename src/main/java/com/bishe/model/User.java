package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String host;

    private String user;

    private String select_priv;

    private String insert_priv;

    private String update_priv;

    private String delete_priv;

    private String create_priv;

    private String drop_priv;

    private String reload_priv;

    private String shutdown_priv;

    private String process_priv;

    private String file_priv;

    private String grant_priv;

    private String references_priv;

    private String index_priv;

    private String alter_priv;

    private String show_db_priv;

    private String super_priv;

    private String create_tmp_table_priv;

    private String lock_tables_priv;

    private String execute_priv;

    private String repl_slave_priv;

    private String repl_client_priv;

    private String create_view_priv;

    private String show_view_priv;

    private String create_routine_priv;

    private String alter_routine_priv;

    private String create_user_priv;

    private String event_priv;

    private String trigger_priv;

    private String create_tablespace_priv;

    private String ssl_type;

    private Integer max_questions;

    private Integer max_updates;

    private Integer max_connections;

    private Integer max_user_connections;

    private String plugin;

    private String password_expired;

    private Date password_last_changed;

    private Short password_lifetime;

    private String account_locked;

    private String create_role_priv;

    private String drop_role_priv;

    private Short password_reuse_history;

    private Short password_reuse_time;

    private String password_require_current;

    private byte[] ssl_cipher;

    private byte[] x509_issuer;

    private byte[] x509_subject;

    private String authentication_string;

    private String user_attributes;

    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getSelect_priv() {
        return select_priv;
    }

    public void setSelect_priv(String select_priv) {
        this.select_priv = select_priv == null ? null : select_priv.trim();
    }

    public String getInsert_priv() {
        return insert_priv;
    }

    public void setInsert_priv(String insert_priv) {
        this.insert_priv = insert_priv == null ? null : insert_priv.trim();
    }

    public String getUpdate_priv() {
        return update_priv;
    }

    public void setUpdate_priv(String update_priv) {
        this.update_priv = update_priv == null ? null : update_priv.trim();
    }

    public String getDelete_priv() {
        return delete_priv;
    }

    public void setDelete_priv(String delete_priv) {
        this.delete_priv = delete_priv == null ? null : delete_priv.trim();
    }

    public String getCreate_priv() {
        return create_priv;
    }

    public void setCreate_priv(String create_priv) {
        this.create_priv = create_priv == null ? null : create_priv.trim();
    }

    public String getDrop_priv() {
        return drop_priv;
    }

    public void setDrop_priv(String drop_priv) {
        this.drop_priv = drop_priv == null ? null : drop_priv.trim();
    }

    public String getReload_priv() {
        return reload_priv;
    }

    public void setReload_priv(String reload_priv) {
        this.reload_priv = reload_priv == null ? null : reload_priv.trim();
    }

    public String getShutdown_priv() {
        return shutdown_priv;
    }

    public void setShutdown_priv(String shutdown_priv) {
        this.shutdown_priv = shutdown_priv == null ? null : shutdown_priv.trim();
    }

    public String getProcess_priv() {
        return process_priv;
    }

    public void setProcess_priv(String process_priv) {
        this.process_priv = process_priv == null ? null : process_priv.trim();
    }

    public String getFile_priv() {
        return file_priv;
    }

    public void setFile_priv(String file_priv) {
        this.file_priv = file_priv == null ? null : file_priv.trim();
    }

    public String getGrant_priv() {
        return grant_priv;
    }

    public void setGrant_priv(String grant_priv) {
        this.grant_priv = grant_priv == null ? null : grant_priv.trim();
    }

    public String getReferences_priv() {
        return references_priv;
    }

    public void setReferences_priv(String references_priv) {
        this.references_priv = references_priv == null ? null : references_priv.trim();
    }

    public String getIndex_priv() {
        return index_priv;
    }

    public void setIndex_priv(String index_priv) {
        this.index_priv = index_priv == null ? null : index_priv.trim();
    }

    public String getAlter_priv() {
        return alter_priv;
    }

    public void setAlter_priv(String alter_priv) {
        this.alter_priv = alter_priv == null ? null : alter_priv.trim();
    }

    public String getShow_db_priv() {
        return show_db_priv;
    }

    public void setShow_db_priv(String show_db_priv) {
        this.show_db_priv = show_db_priv == null ? null : show_db_priv.trim();
    }

    public String getSuper_priv() {
        return super_priv;
    }

    public void setSuper_priv(String super_priv) {
        this.super_priv = super_priv == null ? null : super_priv.trim();
    }

    public String getCreate_tmp_table_priv() {
        return create_tmp_table_priv;
    }

    public void setCreate_tmp_table_priv(String create_tmp_table_priv) {
        this.create_tmp_table_priv = create_tmp_table_priv == null ? null : create_tmp_table_priv.trim();
    }

    public String getLock_tables_priv() {
        return lock_tables_priv;
    }

    public void setLock_tables_priv(String lock_tables_priv) {
        this.lock_tables_priv = lock_tables_priv == null ? null : lock_tables_priv.trim();
    }

    public String getExecute_priv() {
        return execute_priv;
    }

    public void setExecute_priv(String execute_priv) {
        this.execute_priv = execute_priv == null ? null : execute_priv.trim();
    }

    public String getRepl_slave_priv() {
        return repl_slave_priv;
    }

    public void setRepl_slave_priv(String repl_slave_priv) {
        this.repl_slave_priv = repl_slave_priv == null ? null : repl_slave_priv.trim();
    }

    public String getRepl_client_priv() {
        return repl_client_priv;
    }

    public void setRepl_client_priv(String repl_client_priv) {
        this.repl_client_priv = repl_client_priv == null ? null : repl_client_priv.trim();
    }

    public String getCreate_view_priv() {
        return create_view_priv;
    }

    public void setCreate_view_priv(String create_view_priv) {
        this.create_view_priv = create_view_priv == null ? null : create_view_priv.trim();
    }

    public String getShow_view_priv() {
        return show_view_priv;
    }

    public void setShow_view_priv(String show_view_priv) {
        this.show_view_priv = show_view_priv == null ? null : show_view_priv.trim();
    }

    public String getCreate_routine_priv() {
        return create_routine_priv;
    }

    public void setCreate_routine_priv(String create_routine_priv) {
        this.create_routine_priv = create_routine_priv == null ? null : create_routine_priv.trim();
    }

    public String getAlter_routine_priv() {
        return alter_routine_priv;
    }

    public void setAlter_routine_priv(String alter_routine_priv) {
        this.alter_routine_priv = alter_routine_priv == null ? null : alter_routine_priv.trim();
    }

    public String getCreate_user_priv() {
        return create_user_priv;
    }

    public void setCreate_user_priv(String create_user_priv) {
        this.create_user_priv = create_user_priv == null ? null : create_user_priv.trim();
    }

    public String getEvent_priv() {
        return event_priv;
    }

    public void setEvent_priv(String event_priv) {
        this.event_priv = event_priv == null ? null : event_priv.trim();
    }

    public String getTrigger_priv() {
        return trigger_priv;
    }

    public void setTrigger_priv(String trigger_priv) {
        this.trigger_priv = trigger_priv == null ? null : trigger_priv.trim();
    }

    public String getCreate_tablespace_priv() {
        return create_tablespace_priv;
    }

    public void setCreate_tablespace_priv(String create_tablespace_priv) {
        this.create_tablespace_priv = create_tablespace_priv == null ? null : create_tablespace_priv.trim();
    }

    public String getSsl_type() {
        return ssl_type;
    }

    public void setSsl_type(String ssl_type) {
        this.ssl_type = ssl_type == null ? null : ssl_type.trim();
    }

    public Integer getMax_questions() {
        return max_questions;
    }

    public void setMax_questions(Integer max_questions) {
        this.max_questions = max_questions;
    }

    public Integer getMax_updates() {
        return max_updates;
    }

    public void setMax_updates(Integer max_updates) {
        this.max_updates = max_updates;
    }

    public Integer getMax_connections() {
        return max_connections;
    }

    public void setMax_connections(Integer max_connections) {
        this.max_connections = max_connections;
    }

    public Integer getMax_user_connections() {
        return max_user_connections;
    }

    public void setMax_user_connections(Integer max_user_connections) {
        this.max_user_connections = max_user_connections;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin == null ? null : plugin.trim();
    }

    public String getPassword_expired() {
        return password_expired;
    }

    public void setPassword_expired(String password_expired) {
        this.password_expired = password_expired == null ? null : password_expired.trim();
    }

    public Date getPassword_last_changed() {
        return password_last_changed;
    }

    public void setPassword_last_changed(Date password_last_changed) {
        this.password_last_changed = password_last_changed;
    }

    public Short getPassword_lifetime() {
        return password_lifetime;
    }

    public void setPassword_lifetime(Short password_lifetime) {
        this.password_lifetime = password_lifetime;
    }

    public String getAccount_locked() {
        return account_locked;
    }

    public void setAccount_locked(String account_locked) {
        this.account_locked = account_locked == null ? null : account_locked.trim();
    }

    public String getCreate_role_priv() {
        return create_role_priv;
    }

    public void setCreate_role_priv(String create_role_priv) {
        this.create_role_priv = create_role_priv == null ? null : create_role_priv.trim();
    }

    public String getDrop_role_priv() {
        return drop_role_priv;
    }

    public void setDrop_role_priv(String drop_role_priv) {
        this.drop_role_priv = drop_role_priv == null ? null : drop_role_priv.trim();
    }

    public Short getPassword_reuse_history() {
        return password_reuse_history;
    }

    public void setPassword_reuse_history(Short password_reuse_history) {
        this.password_reuse_history = password_reuse_history;
    }

    public Short getPassword_reuse_time() {
        return password_reuse_time;
    }

    public void setPassword_reuse_time(Short password_reuse_time) {
        this.password_reuse_time = password_reuse_time;
    }

    public String getPassword_require_current() {
        return password_require_current;
    }

    public void setPassword_require_current(String password_require_current) {
        this.password_require_current = password_require_current == null ? null : password_require_current.trim();
    }

    public byte[] getSsl_cipher() {
        return ssl_cipher;
    }

    public void setSsl_cipher(byte[] ssl_cipher) {
        this.ssl_cipher = ssl_cipher;
    }

    public byte[] getX509_issuer() {
        return x509_issuer;
    }

    public void setX509_issuer(byte[] x509_issuer) {
        this.x509_issuer = x509_issuer;
    }

    public byte[] getX509_subject() {
        return x509_subject;
    }

    public void setX509_subject(byte[] x509_subject) {
        this.x509_subject = x509_subject;
    }

    public String getAuthentication_string() {
        return authentication_string;
    }

    public void setAuthentication_string(String authentication_string) {
        this.authentication_string = authentication_string == null ? null : authentication_string.trim();
    }

    public String getUser_attributes() {
        return user_attributes;
    }

    public void setUser_attributes(String user_attributes) {
        this.user_attributes = user_attributes == null ? null : user_attributes.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", select_priv=").append(select_priv);
        sb.append(", insert_priv=").append(insert_priv);
        sb.append(", update_priv=").append(update_priv);
        sb.append(", delete_priv=").append(delete_priv);
        sb.append(", create_priv=").append(create_priv);
        sb.append(", drop_priv=").append(drop_priv);
        sb.append(", reload_priv=").append(reload_priv);
        sb.append(", shutdown_priv=").append(shutdown_priv);
        sb.append(", process_priv=").append(process_priv);
        sb.append(", file_priv=").append(file_priv);
        sb.append(", grant_priv=").append(grant_priv);
        sb.append(", references_priv=").append(references_priv);
        sb.append(", index_priv=").append(index_priv);
        sb.append(", alter_priv=").append(alter_priv);
        sb.append(", show_db_priv=").append(show_db_priv);
        sb.append(", super_priv=").append(super_priv);
        sb.append(", create_tmp_table_priv=").append(create_tmp_table_priv);
        sb.append(", lock_tables_priv=").append(lock_tables_priv);
        sb.append(", execute_priv=").append(execute_priv);
        sb.append(", repl_slave_priv=").append(repl_slave_priv);
        sb.append(", repl_client_priv=").append(repl_client_priv);
        sb.append(", create_view_priv=").append(create_view_priv);
        sb.append(", show_view_priv=").append(show_view_priv);
        sb.append(", create_routine_priv=").append(create_routine_priv);
        sb.append(", alter_routine_priv=").append(alter_routine_priv);
        sb.append(", create_user_priv=").append(create_user_priv);
        sb.append(", event_priv=").append(event_priv);
        sb.append(", trigger_priv=").append(trigger_priv);
        sb.append(", create_tablespace_priv=").append(create_tablespace_priv);
        sb.append(", ssl_type=").append(ssl_type);
        sb.append(", max_questions=").append(max_questions);
        sb.append(", max_updates=").append(max_updates);
        sb.append(", max_connections=").append(max_connections);
        sb.append(", max_user_connections=").append(max_user_connections);
        sb.append(", plugin=").append(plugin);
        sb.append(", password_expired=").append(password_expired);
        sb.append(", password_last_changed=").append(password_last_changed);
        sb.append(", password_lifetime=").append(password_lifetime);
        sb.append(", account_locked=").append(account_locked);
        sb.append(", create_role_priv=").append(create_role_priv);
        sb.append(", drop_role_priv=").append(drop_role_priv);
        sb.append(", password_reuse_history=").append(password_reuse_history);
        sb.append(", password_reuse_time=").append(password_reuse_time);
        sb.append(", password_require_current=").append(password_require_current);
        sb.append(", ssl_cipher=").append(ssl_cipher);
        sb.append(", x509_issuer=").append(x509_issuer);
        sb.append(", x509_subject=").append(x509_subject);
        sb.append(", authentication_string=").append(authentication_string);
        sb.append(", user_attributes=").append(user_attributes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}