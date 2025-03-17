package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TipoMeta extends AbstractSankhyaEntity<TipoMeta> {
   private BigDecimal codMeta;
   private BigDecimal codUsu;
   private String compromisso;
   private Timestamp dtAlter;
   private BigDecimal recDesp;
   private BigDecimal codTipOper;

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCompromisso() {
        return compromisso;
   }

   public void setCompromisso(String compromisso) {
        this.compromisso = compromisso;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        this.recDesp = recDesp;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   @Override
   public String getTableName() {
        return "TGMTME";
   }

   @Override
   public String getEntityName() {
        return "TipoMeta";
   }

   @Override
   public TipoMeta fromVO(DynamicVO vo) {
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.compromisso = vo.asString("COMPROMISSO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        return this;
   }
}
