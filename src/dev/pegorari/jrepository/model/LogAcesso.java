package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogAcesso extends AbstractSankhyaEntity<LogAcesso> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDhAcesso() {
        return this.getVo().asTimestamp("DHACESSO");
   }

   public void setDhAcesso(Timestamp dhAcesso) {
        markAsChanged("DHACESSO", dhAcesso);
   }

   public String getHostname() {
        return this.getVo().asString("HOSTNAME");
   }

   public void setHostname(String hostname) {
        markAsChanged("HOSTNAME", hostname);
   }

   public String getIp() {
        return this.getVo().asString("IP");
   }

   public void setIp(String ip) {
        markAsChanged("IP", ip);
   }

   public String getModulo() {
        return this.getVo().asString("MODULO");
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
   }

   public BigDecimal getSid() {
        return this.getVo().asBigDecimal("SID");
   }

   public void setSid(BigDecimal sid) {
        markAsChanged("SID", sid);
   }

   public String getSucesso() {
        return this.getVo().asString("SUCESSO");
   }

   public void setSucesso(String sucesso) {
        markAsChanged("SUCESSO", sucesso);
   }

   public String getTerminal() {
        return this.getVo().asString("TERMINAL");
   }

   public void setTerminal(String terminal) {
        markAsChanged("TERMINAL", terminal);
   }

   public String getUsuario() {
        return this.getVo().asString("USUARIO");
   }

   public void setUsuario(String usuario) {
        markAsChanged("USUARIO", usuario);
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
        this.setVo(vo);
        return this;
   }
}
