package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LimiteLiberacao extends AbstractSankhyaEntity<LimiteLiberacao> {
   public BigDecimal getCodGru() {
        return this.getVo().asBigDecimal("CODGRU");
   }

   public void setCodGru(BigDecimal codGru) {
        markAsChanged("CODGRU", codGru);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getEnviarEmail() {
        return this.getVo().asString("ENVIAREMAIL");
   }

   public void setEnviarEmail(String enviarEmail) {
        markAsChanged("ENVIAREMAIL", enviarEmail);
   }

   public String getEnviarSms() {
        return this.getVo().asString("ENVIARSMS");
   }

   public void setEnviarSms(String enviarSms) {
        markAsChanged("ENVIARSMS", enviarSms);
   }

   public BigDecimal getEvento() {
        return this.getVo().asBigDecimal("EVENTO");
   }

   public void setEvento(BigDecimal evento) {
        markAsChanged("EVENTO", evento);
   }

   public BigDecimal getLimite() {
        return this.getVo().asBigDecimal("LIMITE");
   }

   public void setLimite(BigDecimal limite) {
        markAsChanged("LIMITE", limite);
   }

   public String getTipoEvento() {
        return this.getVo().asString("TIPOEVENTO");
   }

   public void setTipoEvento(String tipoEvento) {
        markAsChanged("TIPOEVENTO", tipoEvento);
   }

   public String getTipoLimite() {
        return this.getVo().asString("TIPOLIMITE");
   }

   public void setTipoLimite(String tipoLimite) {
        markAsChanged("TIPOLIMITE", tipoLimite);
   }

   @Override
   public String getTableName() {
        return "TSILIM";
   }

   @Override
   public String getEntityName() {
        return "LimiteLiberacao";
   }

   @Override
   public LimiteLiberacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
