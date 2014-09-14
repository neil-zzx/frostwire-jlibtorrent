/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class policy {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected policy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(policy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_policy(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public policy(torrent t) {
    this(libtorrent_jni.new_policy(torrent.getCPtr(t), t), true);
  }

  public policy.peer add_peer(SWIGTYPE_p_tcp__endpoint remote, sha1_hash pid, int source, char flags) {
    long cPtr = libtorrent_jni.policy_add_peer(swigCPtr, this, SWIGTYPE_p_tcp__endpoint.getCPtr(remote), sha1_hash.getCPtr(pid), pid, source, flags);
    return (cPtr == 0) ? null : new policy.peer(cPtr, false);
  }

  public boolean update_peer_port(int port, policy.peer p, int src) {
    return libtorrent_jni.policy_update_peer_port(swigCPtr, this, port, policy.peer.getCPtr(p), p, src);
  }

  public boolean new_connection(peer_connection c, int session_time) {
    return libtorrent_jni.policy_new_connection(swigCPtr, this, peer_connection.getCPtr(c), c, session_time);
  }

  public void connection_closed(peer_connection c, int session_time) {
    libtorrent_jni.policy_connection_closed(swigCPtr, this, peer_connection.getCPtr(c), c, session_time);
  }

  public void ban_peer(policy.peer p) {
    libtorrent_jni.policy_ban_peer(swigCPtr, this, policy.peer.getCPtr(p), p);
  }

  public void set_connection(policy.peer p, peer_connection c) {
    libtorrent_jni.policy_set_connection(swigCPtr, this, policy.peer.getCPtr(p), p, peer_connection.getCPtr(c), c);
  }

  public void set_failcount(policy.peer p, int f) {
    libtorrent_jni.policy_set_failcount(swigCPtr, this, policy.peer.getCPtr(p), p, f);
  }

  public void peer_is_interesting(peer_connection c) {
    libtorrent_jni.policy_peer_is_interesting(swigCPtr, this, peer_connection.getCPtr(c), c);
  }

  public void ip_filter_updated() {
    libtorrent_jni.policy_ip_filter_updated(swigCPtr, this);
  }

  public void set_seed(policy.peer p, boolean s) {
    libtorrent_jni.policy_set_seed(swigCPtr, this, policy.peer.getCPtr(p), p, s);
  }

  public void clear_peer_prio() {
    libtorrent_jni.policy_clear_peer_prio(swigCPtr, this);
  }

  static public class peer {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected peer(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(peer obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_policy_peer(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public peer(int port, boolean connectable, int src) {
      this(libtorrent_jni.new_policy_peer(port, connectable, src), true);
    }
  
    public long total_download() {
      return libtorrent_jni.policy_peer_total_download(swigCPtr, this);
    }
  
    public long total_upload() {
      return libtorrent_jni.policy_peer_total_upload(swigCPtr, this);
    }
  
    public long rank(external_ip external, int external_port) {
      return libtorrent_jni.policy_peer_rank(swigCPtr, this, external_ip.getCPtr(external), external, external_port);
    }
  
    public String dest() {
      return libtorrent_jni.policy_peer_dest(swigCPtr, this);
    }
  
    public void setPrev_amount_upload(long value) {
      libtorrent_jni.policy_peer_prev_amount_upload_set(swigCPtr, this, value);
    }
  
    public long getPrev_amount_upload() {
      return libtorrent_jni.policy_peer_prev_amount_upload_get(swigCPtr, this);
    }
  
    public void setPrev_amount_download(long value) {
      libtorrent_jni.policy_peer_prev_amount_download_set(swigCPtr, this, value);
    }
  
    public long getPrev_amount_download() {
      return libtorrent_jni.policy_peer_prev_amount_download_get(swigCPtr, this);
    }
  
    public void setConnection(peer_connection value) {
      libtorrent_jni.policy_peer_connection_set(swigCPtr, this, peer_connection.getCPtr(value), value);
    }
  
    public peer_connection getConnection() {
      long cPtr = libtorrent_jni.policy_peer_connection_get(swigCPtr, this);
      return (cPtr == 0) ? null : new peer_connection(cPtr, true);
    }
  
    public void setPeer_rank(long value) {
      libtorrent_jni.policy_peer_peer_rank_set(swigCPtr, this, value);
    }
  
    public long getPeer_rank() {
      return libtorrent_jni.policy_peer_peer_rank_get(swigCPtr, this);
    }
  
    public void setLast_optimistically_unchoked(int value) {
      libtorrent_jni.policy_peer_last_optimistically_unchoked_set(swigCPtr, this, value);
    }
  
    public int getLast_optimistically_unchoked() {
      return libtorrent_jni.policy_peer_last_optimistically_unchoked_get(swigCPtr, this);
    }
  
    public void setLast_connected(int value) {
      libtorrent_jni.policy_peer_last_connected_set(swigCPtr, this, value);
    }
  
    public int getLast_connected() {
      return libtorrent_jni.policy_peer_last_connected_get(swigCPtr, this);
    }
  
    public void setPort(int value) {
      libtorrent_jni.policy_peer_port_set(swigCPtr, this, value);
    }
  
    public int getPort() {
      return libtorrent_jni.policy_peer_port_get(swigCPtr, this);
    }
  
    public void setUpload_rate_limit(ufloat16 value) {
      libtorrent_jni.policy_peer_upload_rate_limit_set(swigCPtr, this, ufloat16.getCPtr(value), value);
    }
  
    public ufloat16 getUpload_rate_limit() {
      long cPtr = libtorrent_jni.policy_peer_upload_rate_limit_get(swigCPtr, this);
      return (cPtr == 0) ? null : new ufloat16(cPtr, false);
    }
  
    public void setDownload_rate_limit(ufloat16 value) {
      libtorrent_jni.policy_peer_download_rate_limit_set(swigCPtr, this, ufloat16.getCPtr(value), value);
    }
  
    public ufloat16 getDownload_rate_limit() {
      long cPtr = libtorrent_jni.policy_peer_download_rate_limit_get(swigCPtr, this);
      return (cPtr == 0) ? null : new ufloat16(cPtr, false);
    }
  
    public void setHashfails(short value) {
      libtorrent_jni.policy_peer_hashfails_set(swigCPtr, this, value);
    }
  
    public short getHashfails() {
      return libtorrent_jni.policy_peer_hashfails_get(swigCPtr, this);
    }
  
    public void setFailcount(long value) {
      libtorrent_jni.policy_peer_failcount_set(swigCPtr, this, value);
    }
  
    public long getFailcount() {
      return libtorrent_jni.policy_peer_failcount_get(swigCPtr, this);
    }
  
    public void setConnectable(boolean value) {
      libtorrent_jni.policy_peer_connectable_set(swigCPtr, this, value);
    }
  
    public boolean getConnectable() {
      return libtorrent_jni.policy_peer_connectable_get(swigCPtr, this);
    }
  
    public void setOptimistically_unchoked(boolean value) {
      libtorrent_jni.policy_peer_optimistically_unchoked_set(swigCPtr, this, value);
    }
  
    public boolean getOptimistically_unchoked() {
      return libtorrent_jni.policy_peer_optimistically_unchoked_get(swigCPtr, this);
    }
  
    public void setSeed(boolean value) {
      libtorrent_jni.policy_peer_seed_set(swigCPtr, this, value);
    }
  
    public boolean getSeed() {
      return libtorrent_jni.policy_peer_seed_get(swigCPtr, this);
    }
  
    public void setFast_reconnects(long value) {
      libtorrent_jni.policy_peer_fast_reconnects_set(swigCPtr, this, value);
    }
  
    public long getFast_reconnects() {
      return libtorrent_jni.policy_peer_fast_reconnects_get(swigCPtr, this);
    }
  
    public void setTrust_points(int value) {
      libtorrent_jni.policy_peer_trust_points_set(swigCPtr, this, value);
    }
  
    public int getTrust_points() {
      return libtorrent_jni.policy_peer_trust_points_get(swigCPtr, this);
    }
  
    public void setSource(long value) {
      libtorrent_jni.policy_peer_source_set(swigCPtr, this, value);
    }
  
    public long getSource() {
      return libtorrent_jni.policy_peer_source_get(swigCPtr, this);
    }
  
    public void setPe_support(boolean value) {
      libtorrent_jni.policy_peer_pe_support_set(swigCPtr, this, value);
    }
  
    public boolean getPe_support() {
      return libtorrent_jni.policy_peer_pe_support_get(swigCPtr, this);
    }
  
    public void setIs_v6_addr(boolean value) {
      libtorrent_jni.policy_peer_is_v6_addr_set(swigCPtr, this, value);
    }
  
    public boolean getIs_v6_addr() {
      return libtorrent_jni.policy_peer_is_v6_addr_get(swigCPtr, this);
    }
  
    public void setOn_parole(boolean value) {
      libtorrent_jni.policy_peer_on_parole_set(swigCPtr, this, value);
    }
  
    public boolean getOn_parole() {
      return libtorrent_jni.policy_peer_on_parole_get(swigCPtr, this);
    }
  
    public void setBanned(boolean value) {
      libtorrent_jni.policy_peer_banned_set(swigCPtr, this, value);
    }
  
    public boolean getBanned() {
      return libtorrent_jni.policy_peer_banned_get(swigCPtr, this);
    }
  
    public void setAdded_to_dht(boolean value) {
      libtorrent_jni.policy_peer_added_to_dht_set(swigCPtr, this, value);
    }
  
    public boolean getAdded_to_dht() {
      return libtorrent_jni.policy_peer_added_to_dht_get(swigCPtr, this);
    }
  
    public void setSupports_utp(boolean value) {
      libtorrent_jni.policy_peer_supports_utp_set(swigCPtr, this, value);
    }
  
    public boolean getSupports_utp() {
      return libtorrent_jni.policy_peer_supports_utp_get(swigCPtr, this);
    }
  
    public void setConfirmed_supports_utp(boolean value) {
      libtorrent_jni.policy_peer_confirmed_supports_utp_set(swigCPtr, this, value);
    }
  
    public boolean getConfirmed_supports_utp() {
      return libtorrent_jni.policy_peer_confirmed_supports_utp_get(swigCPtr, this);
    }
  
    public void setSupports_holepunch(boolean value) {
      libtorrent_jni.policy_peer_supports_holepunch_set(swigCPtr, this, value);
    }
  
    public boolean getSupports_holepunch() {
      return libtorrent_jni.policy_peer_supports_holepunch_get(swigCPtr, this);
    }
  
    public void setWeb_seed(boolean value) {
      libtorrent_jni.policy_peer_web_seed_set(swigCPtr, this, value);
    }
  
    public boolean getWeb_seed() {
      return libtorrent_jni.policy_peer_web_seed_get(swigCPtr, this);
    }
  
  }

  static public class ipv4_peer extends policy.peer {
    private long swigCPtr;
  
    protected ipv4_peer(long cPtr, boolean cMemoryOwn) {
      super(libtorrent_jni.policy_ipv4_peer_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ipv4_peer obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_policy_ipv4_peer(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public ipv4_peer(SWIGTYPE_p_tcp__endpoint ip, boolean connectable, int src) {
      this(libtorrent_jni.new_policy_ipv4_peer(SWIGTYPE_p_tcp__endpoint.getCPtr(ip), connectable, src), true);
    }
  
    public void setAddr(address_v4 value) {
      libtorrent_jni.policy_ipv4_peer_addr_set(swigCPtr, this, address_v4.getCPtr(value), value);
    }
  
    public address_v4 getAddr() {
      long cPtr = libtorrent_jni.policy_ipv4_peer_addr_get(swigCPtr, this);
      return (cPtr == 0) ? null : new address_v4(cPtr, false);
    }
  
  }

  static public class ipv6_peer extends policy.peer {
    private long swigCPtr;
  
    protected ipv6_peer(long cPtr, boolean cMemoryOwn) {
      super(libtorrent_jni.policy_ipv6_peer_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ipv6_peer obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_policy_ipv6_peer(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public ipv6_peer(SWIGTYPE_p_tcp__endpoint ip, boolean connectable, int src) {
      this(libtorrent_jni.new_policy_ipv6_peer(SWIGTYPE_p_tcp__endpoint.getCPtr(ip), connectable, src), true);
    }
  
  }

  public int num_peers() {
    return libtorrent_jni.policy_num_peers(swigCPtr, this);
  }

  static public class peer_address_compare {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected peer_address_compare(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(peer_address_compare obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_policy_peer_address_compare(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public peer_address_compare() {
      this(libtorrent_jni.new_policy_peer_address_compare(), true);
    }
  
  }

  public boolean connect_one_peer(int session_time) {
    return libtorrent_jni.policy_connect_one_peer(swigCPtr, this, session_time);
  }

  public boolean has_peer(policy.peer p) {
    return libtorrent_jni.policy_has_peer(swigCPtr, this, policy.peer.getCPtr(p), p);
  }

  public int num_seeds() {
    return libtorrent_jni.policy_num_seeds(swigCPtr, this);
  }

  public int num_connect_candidates() {
    return libtorrent_jni.policy_num_connect_candidates(swigCPtr, this);
  }

  public void recalculate_connect_candidates() {
    libtorrent_jni.policy_recalculate_connect_candidates(swigCPtr, this);
  }

  public void erase_peer(policy.peer p) {
    libtorrent_jni.policy_erase_peer(swigCPtr, this, policy.peer.getCPtr(p), p);
  }

}
