package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegImportacaoPO extends AbstractSankhyaEntity<RegImportacaoPO> {
   public String getCabArq() {
        return this.getVo().asString("CABARQ");
   }

   public void setCabArq(String cabArq) {
        markAsChanged("CABARQ", cabArq);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtProc() {
        return this.getVo().asTimestamp("DTPROC");
   }

   public void setDtProc(Timestamp dtProc) {
        markAsChanged("DTPROC", dtProc);
   }

   public BigDecimal getNuImport() {
        return this.getVo().asBigDecimal("NUIMPORT");
   }

   public void setNuImport(BigDecimal nuImport) {
        markAsChanged("NUIMPORT", nuImport);
   }

   @Override
   public String getTableName() {
        return "TGFIPO";
   }

   @Override
   public String getEntityName() {
        return "RegImportacaoPO";
   }

   @Override
   public RegImportacaoPO fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
