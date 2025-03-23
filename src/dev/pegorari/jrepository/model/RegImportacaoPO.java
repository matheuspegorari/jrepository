package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegImportacaoPO extends AbstractSankhyaEntity<RegImportacaoPO> {
   private String cabArq;
   private BigDecimal codMeta;
   private BigDecimal codUsu;
   private Timestamp dtProc;
   private BigDecimal nuImport;

   public String getCabArq() {
        return cabArq;
   }

   public void setCabArq(String cabArq) {
        markAsChanged("CABARQ", cabArq);
        this.cabArq = cabArq;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtProc() {
        return dtProc;
   }

   public void setDtProc(Timestamp dtProc) {
        markAsChanged("DTPROC", dtProc);
        this.dtProc = dtProc;
   }

   public BigDecimal getNuImport() {
        return nuImport;
   }

   public void setNuImport(BigDecimal nuImport) {
        markAsChanged("NUIMPORT", nuImport);
        this.nuImport = nuImport;
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
        this.cabArq = vo.asString("CABARQ");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtProc = vo.asTimestamp("DTPROC");
        this.nuImport = vo.asBigDecimal("NUIMPORT");
        return this;
   }
}
