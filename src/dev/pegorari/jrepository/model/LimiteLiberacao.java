package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class LimiteLiberacao implements SankhyaEntity<LimiteLiberacao> {

   private BigDecimal codGru;
   private BigDecimal codUsu;
   private String enviarEmail;
   private String enviarSms;
   private BigDecimal evento;
   private BigDecimal limite;
   private String tipoEvento;
   private String tipoLimite;

   public BigDecimal getCodGru() {
        return codGru;
   }

   public void setCodGru(BigDecimal codGru) {
        this.codGru = codGru;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getEnviarEmail() {
        return enviarEmail;
   }

   public void setEnviarEmail(String enviarEmail) {
        this.enviarEmail = enviarEmail;
   }

   public String getEnviarSms() {
        return enviarSms;
   }

   public void setEnviarSms(String enviarSms) {
        this.enviarSms = enviarSms;
   }

   public BigDecimal getEvento() {
        return evento;
   }

   public void setEvento(BigDecimal evento) {
        this.evento = evento;
   }

   public BigDecimal getLimite() {
        return limite;
   }

   public void setLimite(BigDecimal limite) {
        this.limite = limite;
   }

   public String getTipoEvento() {
        return tipoEvento;
   }

   public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
   }

   public String getTipoLimite() {
        return tipoLimite;
   }

   public void setTipoLimite(String tipoLimite) {
        this.tipoLimite = tipoLimite;
   }

   @Override
   public String getEntityName() {
        return "LimiteLiberacao";
   }

   @Override
   public LimiteLiberacao fromVO(DynamicVO vo) {
        this.codGru = vo.asBigDecimal("CODGRU");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.enviarEmail = vo.asString("ENVIAREMAIL");
        this.enviarSms = vo.asString("ENVIARSMS");
        this.evento = vo.asBigDecimal("EVENTO");
        this.limite = vo.asBigDecimal("LIMITE");
        this.tipoEvento = vo.asString("TIPOEVENTO");
        this.tipoLimite = vo.asString("TIPOLIMITE");
        return this;
   }
}
