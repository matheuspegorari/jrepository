package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemAjusteIpi implements SankhyaEntity<ItemAjusteIpi> {

   private BigDecimal codProd;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private BigDecimal vlrAjuste;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getVlrAjuste() {
        return vlrAjuste;
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        this.vlrAjuste = vlrAjuste;
   }

   @Override
   public String getEntityName() {
        return "ItemAjusteIpi";
   }

   @Override
   public ItemAjusteIpi fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.vlrAjuste = vo.asBigDecimal("VLRAJUSTE");
        return this;
   }
}
