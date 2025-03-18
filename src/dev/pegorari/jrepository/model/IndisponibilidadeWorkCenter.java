package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class IndisponibilidadeWorkCenter extends AbstractSankhyaEntity<IndisponibilidadeWorkCenter> {
   private BigDecimal codUsu;
   private BigDecimal codWcp;
   private Timestamp dhAlter;
   private Timestamp dhFinal;
   private Timestamp dhIncial;
   private String motivo;
   private BigDecimal nuIwc;
   private String observacao;
   private String situacao;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
        this.dhFinal = dhFinal;
   }

   public Timestamp getDhIncial() {
        return dhIncial;
   }

   public void setDhIncial(Timestamp dhIncial) {
        markAsChanged("DHINCIAL", dhIncial);
        this.dhIncial = dhIncial;
   }

   public String getMotivo() {
        return motivo;
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
        this.motivo = motivo;
   }

   public BigDecimal getNuIwc() {
        return nuIwc;
   }

   public void setNuIwc(BigDecimal nuIwc) {
        markAsChanged("NUIWC", nuIwc);
        this.nuIwc = nuIwc;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
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
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.dhIncial = vo.asTimestamp("DHINCIAL");
        this.motivo = vo.asString("MOTIVO");
        this.nuIwc = vo.asBigDecimal("NUIWC");
        this.observacao = vo.asString("OBSERVACAO");
        this.situacao = vo.asString("SITUACAO");
        return this;
   }
}
