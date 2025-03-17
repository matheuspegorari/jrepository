package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AntecipacaoRecebiveis extends AbstractSankhyaEntity<AntecipacaoRecebiveis> {
   private BigDecimal nuFintitiof;
   private String docAntbanc;
   private Timestamp dtAntbanc;
   private BigDecimal nuAntbanc;
   private BigDecimal nuFindespadic;
   private BigDecimal nuFintitban;
   private BigDecimal nuFintitjur;
   private BigDecimal nuFintitobr;
   private BigDecimal nuFintitori;
   private String statusAnt;
   private BigDecimal nuFindespop;

   public BigDecimal getNuFintitiof() {
        return nuFintitiof;
   }

   public void setNuFintitiof(BigDecimal nuFintitiof) {
        this.nuFintitiof = nuFintitiof;
   }

   public String getDocAntbanc() {
        return docAntbanc;
   }

   public void setDocAntbanc(String docAntbanc) {
        this.docAntbanc = docAntbanc;
   }

   public Timestamp getDtAntbanc() {
        return dtAntbanc;
   }

   public void setDtAntbanc(Timestamp dtAntbanc) {
        this.dtAntbanc = dtAntbanc;
   }

   public BigDecimal getNuAntbanc() {
        return nuAntbanc;
   }

   public void setNuAntbanc(BigDecimal nuAntbanc) {
        this.nuAntbanc = nuAntbanc;
   }

   public BigDecimal getNuFindespadic() {
        return nuFindespadic;
   }

   public void setNuFindespadic(BigDecimal nuFindespadic) {
        this.nuFindespadic = nuFindespadic;
   }

   public BigDecimal getNuFintitban() {
        return nuFintitban;
   }

   public void setNuFintitban(BigDecimal nuFintitban) {
        this.nuFintitban = nuFintitban;
   }

   public BigDecimal getNuFintitjur() {
        return nuFintitjur;
   }

   public void setNuFintitjur(BigDecimal nuFintitjur) {
        this.nuFintitjur = nuFintitjur;
   }

   public BigDecimal getNuFintitobr() {
        return nuFintitobr;
   }

   public void setNuFintitobr(BigDecimal nuFintitobr) {
        this.nuFintitobr = nuFintitobr;
   }

   public BigDecimal getNuFintitori() {
        return nuFintitori;
   }

   public void setNuFintitori(BigDecimal nuFintitori) {
        this.nuFintitori = nuFintitori;
   }

   public String getStatusAnt() {
        return statusAnt;
   }

   public void setStatusAnt(String statusAnt) {
        this.statusAnt = statusAnt;
   }

   public BigDecimal getNuFindespop() {
        return nuFindespop;
   }

   public void setNuFindespop(BigDecimal nuFindespop) {
        this.nuFindespop = nuFindespop;
   }

   @Override
   public String getTableName() {
        return "TGFANB";
   }

   @Override
   public String getEntityName() {
        return "AntecipacaoRecebiveis";
   }

   @Override
   public AntecipacaoRecebiveis fromVO(DynamicVO vo) {
        this.nuFintitiof = vo.asBigDecimal("NUFINTITIOF");
        this.docAntbanc = vo.asString("DOCANTBANC");
        this.dtAntbanc = vo.asTimestamp("DTANTBANC");
        this.nuAntbanc = vo.asBigDecimal("NUANTBANC");
        this.nuFindespadic = vo.asBigDecimal("NUFINDESPADIC");
        this.nuFintitban = vo.asBigDecimal("NUFINTITBAN");
        this.nuFintitjur = vo.asBigDecimal("NUFINTITJUR");
        this.nuFintitobr = vo.asBigDecimal("NUFINTITOBR");
        this.nuFintitori = vo.asBigDecimal("NUFINTITORI");
        this.statusAnt = vo.asString("STATUSANT");
        this.nuFindespop = vo.asBigDecimal("NUFINDESPOP");
        return this;
   }
}
