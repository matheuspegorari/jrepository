package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Viagem extends AbstractSankhyaEntity<Viagem> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVeiprin() {
        return this.getVo().asBigDecimal("CODVEIPRIN");
   }

   public void setCodVeiprin(BigDecimal codVeiprin) {
        markAsChanged("CODVEIPRIN", codVeiprin);
   }

   public BigDecimal getCodVeireb1() {
        return this.getVo().asBigDecimal("CODVEIREB1");
   }

   public void setCodVeireb1(BigDecimal codVeireb1) {
        markAsChanged("CODVEIREB1", codVeireb1);
   }

   public BigDecimal getCodVeireb2() {
        return this.getVo().asBigDecimal("CODVEIREB2");
   }

   public void setCodVeireb2(BigDecimal codVeireb2) {
        markAsChanged("CODVEIREB2", codVeireb2);
   }

   public BigDecimal getCodVeireb3() {
        return this.getVo().asBigDecimal("CODVEIREB3");
   }

   public void setCodVeireb3(BigDecimal codVeireb3) {
        markAsChanged("CODVEIREB3", codVeireb3);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getStatusDoc() {
        return this.getVo().asString("STATUSDOC");
   }

   public void setStatusDoc(String statusDoc) {
        markAsChanged("STATUSDOC", statusDoc);
   }

   public String getTipAmb() {
        return this.getVo().asString("TIPAMB");
   }

   public void setTipAmb(String tipAmb) {
        markAsChanged("TIPAMB", tipAmb);
   }

   public String getTipModalmdfe() {
        return this.getVo().asString("TIPMODALMDFE");
   }

   public void setTipModalmdfe(String tipModalmdfe) {
        markAsChanged("TIPMODALMDFE", tipModalmdfe);
   }

   public String getUsaTomServcontr() {
        return this.getVo().asString("USATOMSERVCONTR");
   }

   public void setUsaTomServcontr(String usaTomServcontr) {
        markAsChanged("USATOMSERVCONTR", usaTomServcontr);
   }

   public String getUsaCiotctevinc() {
        return this.getVo().asString("USACIOTCTEVINC");
   }

   public void setUsaCiotctevinc(String usaCiotctevinc) {
        markAsChanged("USACIOTCTEVINC", usaCiotctevinc);
   }

   public String getContemDocterc() {
        return this.getVo().asString("CONTEMDOCTERC");
   }

   public void setContemDocterc(String contemDocterc) {
        markAsChanged("CONTEMDOCTERC", contemDocterc);
   }

   @Override
   public String getTableName() {
        return "TGFVIAG";
   }

   @Override
   public String getEntityName() {
        return "Viagem";
   }

   @Override
   public Viagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
