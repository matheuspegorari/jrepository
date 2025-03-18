package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogAcesso extends AbstractSankhyaEntity<LogAcesso> {
   private BigDecimal codProd;
   private Timestamp dhAcesso;
   private String hostname;
   private String ip;
   private String modulo;
   private BigDecimal sid;
   private String sucesso;
   private String terminal;
   private String usuario;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public Timestamp getDhAcesso() {
        return dhAcesso;
   }

   public void setDhAcesso(Timestamp dhAcesso) {
        markAsChanged("DHACESSO", dhAcesso);
        this.dhAcesso = dhAcesso;
   }

   public String getHostname() {
        return hostname;
   }

   public void setHostname(String hostname) {
        markAsChanged("HOSTNAME", hostname);
        this.hostname = hostname;
   }

   public String getIp() {
        return ip;
   }

   public void setIp(String ip) {
        markAsChanged("IP", ip);
        this.ip = ip;
   }

   public String getModulo() {
        return modulo;
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
        this.modulo = modulo;
   }

   public BigDecimal getSid() {
        return sid;
   }

   public void setSid(BigDecimal sid) {
        markAsChanged("SID", sid);
        this.sid = sid;
   }

   public String getSucesso() {
        return sucesso;
   }

   public void setSucesso(String sucesso) {
        markAsChanged("SUCESSO", sucesso);
        this.sucesso = sucesso;
   }

   public String getTerminal() {
        return terminal;
   }

   public void setTerminal(String terminal) {
        markAsChanged("TERMINAL", terminal);
        this.terminal = terminal;
   }

   public String getUsuario() {
        return usuario;
   }

   public void setUsuario(String usuario) {
        markAsChanged("USUARIO", usuario);
        this.usuario = usuario;
   }

   @Override
   public String getTableName() {
        return "TSILAC";
   }

   @Override
   public String getEntityName() {
        return "LogAcesso";
   }

   @Override
   public LogAcesso fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dhAcesso = vo.asTimestamp("DHACESSO");
        this.hostname = vo.asString("HOSTNAME");
        this.ip = vo.asString("IP");
        this.modulo = vo.asString("MODULO");
        this.sid = vo.asBigDecimal("SID");
        this.sucesso = vo.asString("SUCESSO");
        this.terminal = vo.asString("TERMINAL");
        this.usuario = vo.asString("USUARIO");
        return this;
   }
}
