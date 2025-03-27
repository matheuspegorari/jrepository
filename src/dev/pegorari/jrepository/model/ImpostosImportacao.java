package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostosImportacao extends AbstractSankhyaEntity<ImpostosImportacao> {
   public BigDecimal getBaseImposto() {
        return this.getVo().asBigDecimal("BASEIMPOSTO");
   }

   public void setBaseImposto(BigDecimal baseImposto) {
        markAsChanged("BASEIMPOSTO", baseImposto);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getVlrDespadua() {
        return this.getVo().asBigDecimal("VLRDESPADUA");
   }

   public void setVlrDespadua(BigDecimal vlrDespadua) {
        markAsChanged("VLRDESPADUA", vlrDespadua);
   }

   public BigDecimal getVlrImposto() {
        return this.getVo().asBigDecimal("VLRIMPOSTO");
   }

   public void setVlrImposto(BigDecimal vlrImposto) {
        markAsChanged("VLRIMPOSTO", vlrImposto);
   }

   public BigDecimal getVlrIof() {
        return this.getVo().asBigDecimal("VLRIOF");
   }

   public void setVlrIof(BigDecimal vlrIof) {
        markAsChanged("VLRIOF", vlrIof);
   }

   public String getImpTagExcnNotNac() {
        return this.getVo().asString("IMPTAGEXCNOTNAC");
   }

   public void setImpTagExcnNotNac(String impTagExcnNotNac) {
        markAsChanged("IMPTAGEXCNOTNAC", impTagExcnNotNac);
   }

   @Override
   public String getTableName() {
        return "TGFIII";
   }

   @Override
   public String getEntityName() {
        return "ImpostosImportacao";
   }

   @Override
   public ImpostosImportacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
