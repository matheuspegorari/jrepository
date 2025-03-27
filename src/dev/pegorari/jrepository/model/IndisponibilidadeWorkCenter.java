package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class IndisponibilidadeWorkCenter extends AbstractSankhyaEntity<IndisponibilidadeWorkCenter> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhFinal() {
        return this.getVo().asTimestamp("DHFINAL");
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
   }

   public Timestamp getDhIncial() {
        return this.getVo().asTimestamp("DHINCIAL");
   }

   public void setDhIncial(Timestamp dhIncial) {
        markAsChanged("DHINCIAL", dhIncial);
   }

   public String getMotivo() {
        return this.getVo().asString("MOTIVO");
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
   }

   public BigDecimal getNuIwc() {
        return this.getVo().asBigDecimal("NUIWC");
   }

   public void setNuIwc(BigDecimal nuIwc) {
        markAsChanged("NUIWC", nuIwc);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   @Override
   public String getTableName() {
        return "TPRIWC";
   }

   @Override
   public String getEntityName() {
        return "IndisponibilidadeWorkCenter";
   }

   @Override
   public IndisponibilidadeWorkCenter fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
