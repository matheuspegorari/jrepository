package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HierarquiaDemonstrativo extends AbstractSankhyaEntity<HierarquiaDemonstrativo> {
   private String geradra;
   private String grupdemonSdfc;
   private String grupodemonst;
   private String indgrpdre;
   private String invertvlralt;
   private String sitdfc;
   private String inddcctafin;
   private String inddcctaini;
   private BigDecimal nuordem;
   private BigDecimal grau;
   private String agrupdlpa;
   private String indgrubal;
   private String analitico;
   private String coddmtpai;
   private BigDecimal codemp;
   private String coddmt;
   private BigDecimal codtdm;
   private String ativo;
   private String situacao;
   private String descrdmt;

   public String getGeradra() {
        return geradra;
   }

   public void setGeradra(String geradra) {
        markAsChanged("GERADRA", geradra);
        this.geradra = geradra;
   }

   public String getGrupdemonSdfc() {
        return grupdemonSdfc;
   }

   public void setGrupdemonSdfc(String grupdemonSdfc) {
        markAsChanged("GRUPDEMONSDFC", grupdemonSdfc);
        this.grupdemonSdfc = grupdemonSdfc;
   }

   public String getGrupodemonst() {
        return grupodemonst;
   }

   public void setGrupodemonst(String grupodemonst) {
        markAsChanged("GRUPODEMONST", grupodemonst);
        this.grupodemonst = grupodemonst;
   }

   public String getIndgrpdre() {
        return indgrpdre;
   }

   public void setIndgrpdre(String indgrpdre) {
        markAsChanged("INDGRPDRE", indgrpdre);
        this.indgrpdre = indgrpdre;
   }

   public String getInvertvlralt() {
        return invertvlralt;
   }

   public void setInvertvlralt(String invertvlralt) {
        markAsChanged("INVERTVLRALT", invertvlralt);
        this.invertvlralt = invertvlralt;
   }

   public String getSitdfc() {
        return sitdfc;
   }

   public void setSitdfc(String sitdfc) {
        markAsChanged("SITDFC", sitdfc);
        this.sitdfc = sitdfc;
   }

   public String getInddcctafin() {
        return inddcctafin;
   }

   public void setInddcctafin(String inddcctafin) {
        markAsChanged("INDDCCTAFIN", inddcctafin);
        this.inddcctafin = inddcctafin;
   }

   public String getInddcctaini() {
        return inddcctaini;
   }

   public void setInddcctaini(String inddcctaini) {
        markAsChanged("INDDCCTAINI", inddcctaini);
        this.inddcctaini = inddcctaini;
   }

   public BigDecimal getNuordem() {
        return nuordem;
   }

   public void setNuordem(BigDecimal nuordem) {
        markAsChanged("NUORDEM", nuordem);
        this.nuordem = nuordem;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getAgrupdlpa() {
        return agrupdlpa;
   }

   public void setAgrupdlpa(String agrupdlpa) {
        markAsChanged("AGRUPDLPA", agrupdlpa);
        this.agrupdlpa = agrupdlpa;
   }

   public String getIndgrubal() {
        return indgrubal;
   }

   public void setIndgrubal(String indgrubal) {
        markAsChanged("INDGRUBAL", indgrubal);
        this.indgrubal = indgrubal;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getCoddmtpai() {
        return coddmtpai;
   }

   public void setCoddmtpai(String coddmtpai) {
        markAsChanged("CODDMTPAI", coddmtpai);
        this.coddmtpai = coddmtpai;
   }

   public BigDecimal getCodemp() {
        return codemp;
   }

   public void setCodemp(BigDecimal codemp) {
        markAsChanged("CODEMP", codemp);
        this.codemp = codemp;
   }

   public String getCoddmt() {
        return coddmt;
   }

   public void setCoddmt(String coddmt) {
        markAsChanged("CODDMT", coddmt);
        this.coddmt = coddmt;
   }

   public BigDecimal getCodtdm() {
        return codtdm;
   }

   public void setCodtdm(BigDecimal codtdm) {
        markAsChanged("CODTDM", codtdm);
        this.codtdm = codtdm;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getDescrdmt() {
        return descrdmt;
   }

   public void setDescrdmt(String descrdmt) {
        markAsChanged("DESCRDMT", descrdmt);
        this.descrdmt = descrdmt;
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
        this.setOriginalVO(vo);
        this.geradra = vo.asString("GERADRA");
        this.grupdemonSdfc = vo.asString("GRUPDEMONSDFC");
        this.grupodemonst = vo.asString("GRUPODEMONST");
        this.indgrpdre = vo.asString("INDGRPDRE");
        this.invertvlralt = vo.asString("INVERTVLRALT");
        this.sitdfc = vo.asString("SITDFC");
        this.inddcctafin = vo.asString("INDDCCTAFIN");
        this.inddcctaini = vo.asString("INDDCCTAINI");
        this.nuordem = vo.asBigDecimal("NUORDEM");
        this.grau = vo.asBigDecimal("GRAU");
        this.agrupdlpa = vo.asString("AGRUPDLPA");
        this.indgrubal = vo.asString("INDGRUBAL");
        this.analitico = vo.asString("ANALITICO");
        this.coddmtpai = vo.asString("CODDMTPAI");
        this.codemp = vo.asBigDecimal("CODEMP");
        this.coddmt = vo.asString("CODDMT");
        this.codtdm = vo.asBigDecimal("CODTDM");
        this.ativo = vo.asString("ATIVO");
        this.situacao = vo.asString("SITUACAO");
        this.descrdmt = vo.asString("DESCRDMT");
        return this;
   }
}
