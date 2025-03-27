package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AntecipacaoRecebiveis extends AbstractSankhyaEntity<AntecipacaoRecebiveis> {
   public BigDecimal getNuFintitiof() {
        return this.getVo().asBigDecimal("NUFINTITIOF");
   }

   public void setNuFintitiof(BigDecimal nuFintitiof) {
        markAsChanged("NUFINTITIOF", nuFintitiof);
   }

   public String getDocAntbanc() {
        return this.getVo().asString("DOCANTBANC");
   }

   public void setDocAntbanc(String docAntbanc) {
        markAsChanged("DOCANTBANC", docAntbanc);
   }

   public Timestamp getDtAntbanc() {
        return this.getVo().asTimestamp("DTANTBANC");
   }

   public void setDtAntbanc(Timestamp dtAntbanc) {
        markAsChanged("DTANTBANC", dtAntbanc);
   }

   public BigDecimal getNuAntbanc() {
        return this.getVo().asBigDecimal("NUANTBANC");
   }

   public void setNuAntbanc(BigDecimal nuAntbanc) {
        markAsChanged("NUANTBANC", nuAntbanc);
   }

   public BigDecimal getNuFindespadic() {
        return this.getVo().asBigDecimal("NUFINDESPADIC");
   }

   public void setNuFindespadic(BigDecimal nuFindespadic) {
        markAsChanged("NUFINDESPADIC", nuFindespadic);
   }

   public BigDecimal getNuFintitban() {
        return this.getVo().asBigDecimal("NUFINTITBAN");
   }

   public void setNuFintitban(BigDecimal nuFintitban) {
        markAsChanged("NUFINTITBAN", nuFintitban);
   }

   public BigDecimal getNuFintitjur() {
        return this.getVo().asBigDecimal("NUFINTITJUR");
   }

   public void setNuFintitjur(BigDecimal nuFintitjur) {
        markAsChanged("NUFINTITJUR", nuFintitjur);
   }

   public BigDecimal getNuFintitobr() {
        return this.getVo().asBigDecimal("NUFINTITOBR");
   }

   public void setNuFintitobr(BigDecimal nuFintitobr) {
        markAsChanged("NUFINTITOBR", nuFintitobr);
   }

   public BigDecimal getNuFintitori() {
        return this.getVo().asBigDecimal("NUFINTITORI");
   }

   public void setNuFintitori(BigDecimal nuFintitori) {
        markAsChanged("NUFINTITORI", nuFintitori);
   }

   public String getStatusAnt() {
        return this.getVo().asString("STATUSANT");
   }

   public void setStatusAnt(String statusAnt) {
        markAsChanged("STATUSANT", statusAnt);
   }

   public BigDecimal getNuFindespop() {
        return this.getVo().asBigDecimal("NUFINDESPOP");
   }

   public void setNuFindespop(BigDecimal nuFindespop) {
        markAsChanged("NUFINDESPOP", nuFindespop);
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
        this.setVo(vo);
        return this;
   }
}
