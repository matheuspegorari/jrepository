package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HierarquiaDemonstrativo extends AbstractSankhyaEntity<HierarquiaDemonstrativo> {
   public String getGeradra() {
        return this.getVo().asString("GERADRA");
   }

   public void setGeradra(String geradra) {
        markAsChanged("GERADRA", geradra);
   }

   public String getGrupdemonSdfc() {
        return this.getVo().asString("GRUPDEMONSDFC");
   }

   public void setGrupdemonSdfc(String grupdemonSdfc) {
        markAsChanged("GRUPDEMONSDFC", grupdemonSdfc);
   }

   public String getGrupodemonst() {
        return this.getVo().asString("GRUPODEMONST");
   }

   public void setGrupodemonst(String grupodemonst) {
        markAsChanged("GRUPODEMONST", grupodemonst);
   }

   public String getIndgrpdre() {
        return this.getVo().asString("INDGRPDRE");
   }

   public void setIndgrpdre(String indgrpdre) {
        markAsChanged("INDGRPDRE", indgrpdre);
   }

   public String getInvertvlralt() {
        return this.getVo().asString("INVERTVLRALT");
   }

   public void setInvertvlralt(String invertvlralt) {
        markAsChanged("INVERTVLRALT", invertvlralt);
   }

   public String getSitdfc() {
        return this.getVo().asString("SITDFC");
   }

   public void setSitdfc(String sitdfc) {
        markAsChanged("SITDFC", sitdfc);
   }

   public String getInddcctafin() {
        return this.getVo().asString("INDDCCTAFIN");
   }

   public void setInddcctafin(String inddcctafin) {
        markAsChanged("INDDCCTAFIN", inddcctafin);
   }

   public String getInddcctaini() {
        return this.getVo().asString("INDDCCTAINI");
   }

   public void setInddcctaini(String inddcctaini) {
        markAsChanged("INDDCCTAINI", inddcctaini);
   }

   public BigDecimal getNuordem() {
        return this.getVo().asBigDecimal("NUORDEM");
   }

   public void setNuordem(BigDecimal nuordem) {
        markAsChanged("NUORDEM", nuordem);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getAgrupdlpa() {
        return this.getVo().asString("AGRUPDLPA");
   }

   public void setAgrupdlpa(String agrupdlpa) {
        markAsChanged("AGRUPDLPA", agrupdlpa);
   }

   public String getIndgrubal() {
        return this.getVo().asString("INDGRUBAL");
   }

   public void setIndgrubal(String indgrubal) {
        markAsChanged("INDGRUBAL", indgrubal);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getCoddmtpai() {
        return this.getVo().asString("CODDMTPAI");
   }

   public void setCoddmtpai(String coddmtpai) {
        markAsChanged("CODDMTPAI", coddmtpai);
   }

   public BigDecimal getCodemp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodemp(BigDecimal codemp) {
        markAsChanged("CODEMP", codemp);
   }

   public String getCoddmt() {
        return this.getVo().asString("CODDMT");
   }

   public void setCoddmt(String coddmt) {
        markAsChanged("CODDMT", coddmt);
   }

   public BigDecimal getCodtdm() {
        return this.getVo().asBigDecimal("CODTDM");
   }

   public void setCodtdm(BigDecimal codtdm) {
        markAsChanged("CODTDM", codtdm);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getDescrdmt() {
        return this.getVo().asString("DESCRDMT");
   }

   public void setDescrdmt(String descrdmt) {
        markAsChanged("DESCRDMT", descrdmt);
   }

   @Override
   public String getTableName() {
        return "TCBDMT";
   }

   @Override
   public String getEntityName() {
        return "HierarquiaDemonstrativo";
   }

   @Override
   public HierarquiaDemonstrativo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
