package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AntecipacaoRecebiveis implements SankhyaEntity<AntecipacaoRecebiveis> {

   private BigDecimal nuFinTitIof;
   private String docAntBanc;
   private Timestamp dtAntBanc;
   private BigDecimal nuAntBanc;
   private BigDecimal nuFinDespAdic;
   private BigDecimal nuFinTitBan;
   private BigDecimal nuFinTitJur;
   private BigDecimal nuFinTitObr;
   private BigDecimal nuFinTitOri;
   private String statusAnt;
   private BigDecimal nuFinDespOp;

   public BigDecimal getNuFinTitIof() {
        return nuFinTitIof;
   }

   public void setNuFinTitIof(BigDecimal nuFinTitIof) {
        this.nuFinTitIof = nuFinTitIof;
   }

   public String getDocAntBanc() {
        return docAntBanc;
   }

   public void setDocAntBanc(String docAntBanc) {
        this.docAntBanc = docAntBanc;
   }

   public Timestamp getDtAntBanc() {
        return dtAntBanc;
   }

   public void setDtAntBanc(Timestamp dtAntBanc) {
        this.dtAntBanc = dtAntBanc;
   }

   public BigDecimal getNuAntBanc() {
        return nuAntBanc;
   }

   public void setNuAntBanc(BigDecimal nuAntBanc) {
        this.nuAntBanc = nuAntBanc;
   }

   public BigDecimal getNuFinDespAdic() {
        return nuFinDespAdic;
   }

   public void setNuFinDespAdic(BigDecimal nuFinDespAdic) {
        this.nuFinDespAdic = nuFinDespAdic;
   }

   public BigDecimal getNuFinTitBan() {
        return nuFinTitBan;
   }

   public void setNuFinTitBan(BigDecimal nuFinTitBan) {
        this.nuFinTitBan = nuFinTitBan;
   }

   public BigDecimal getNuFinTitJur() {
        return nuFinTitJur;
   }

   public void setNuFinTitJur(BigDecimal nuFinTitJur) {
        this.nuFinTitJur = nuFinTitJur;
   }

   public BigDecimal getNuFinTitObr() {
        return nuFinTitObr;
   }

   public void setNuFinTitObr(BigDecimal nuFinTitObr) {
        this.nuFinTitObr = nuFinTitObr;
   }

   public BigDecimal getNuFinTitOri() {
        return nuFinTitOri;
   }

   public void setNuFinTitOri(BigDecimal nuFinTitOri) {
        this.nuFinTitOri = nuFinTitOri;
   }

   public String getStatusAnt() {
        return statusAnt;
   }

   public void setStatusAnt(String statusAnt) {
        this.statusAnt = statusAnt;
   }

   public BigDecimal getNuFinDespOp() {
        return nuFinDespOp;
   }

   public void setNuFinDespOp(BigDecimal nuFinDespOp) {
        this.nuFinDespOp = nuFinDespOp;
   }

   @Override
   public String getEntityName() {
        return "AntecipacaoRecebiveis";
   }

   @Override
   public AntecipacaoRecebiveis fromVO(DynamicVO vo) {
        this.nuFinTitIof = vo.asBigDecimal("NUFINTITIOF");
        this.docAntBanc = vo.asString("DOCANTBANC");
        this.dtAntBanc = vo.asTimestamp("DTANTBANC");
        this.nuAntBanc = vo.asBigDecimal("NUANTBANC");
        this.nuFinDespAdic = vo.asBigDecimal("NUFINDESPADIC");
        this.nuFinTitBan = vo.asBigDecimal("NUFINTITBAN");
        this.nuFinTitJur = vo.asBigDecimal("NUFINTITJUR");
        this.nuFinTitObr = vo.asBigDecimal("NUFINTITOBR");
        this.nuFinTitOri = vo.asBigDecimal("NUFINTITORI");
        this.statusAnt = vo.asString("STATUSANT");
        this.nuFinDespOp = vo.asBigDecimal("NUFINDESPOP");
        return this;
   }
}
