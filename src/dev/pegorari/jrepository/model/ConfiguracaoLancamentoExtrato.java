package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoLancamentoExtrato extends AbstractSankhyaEntity<ConfiguracaoLancamentoExtrato> {
   private BigDecimal codProj;
   private BigDecimal catLanc;
   private BigDecimal codBco;
   private BigDecimal codCencus;
   private BigDecimal codEmp;
   private BigDecimal codLanc;
   private BigDecimal codNat;
   private BigDecimal codParc;
   private BigDecimal codTipOper;
   private BigDecimal codTipTit;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String hist;
   private String tipoTransacao;
   private BigDecimal codTipOperBaixa;

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public BigDecimal getCatLanc() {
        return catLanc;
   }

   public void setCatLanc(BigDecimal catLanc) {
        markAsChanged("CATLANC", catLanc);
        this.catLanc = catLanc;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLanc() {
        return codLanc;
   }

   public void setCodLanc(BigDecimal codLanc) {
        markAsChanged("CODLANC", codLanc);
        this.codLanc = codLanc;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipTit() {
        return codTipTit;
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
        this.codTipTit = codTipTit;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getHist() {
        return hist;
   }

   public void setHist(String hist) {
        markAsChanged("HIST", hist);
        this.hist = hist;
   }

   public String getTipoTransacao() {
        return tipoTransacao;
   }

   public void setTipoTransacao(String tipoTransacao) {
        markAsChanged("TIPOTRANSACAO", tipoTransacao);
        this.tipoTransacao = tipoTransacao;
   }

   public BigDecimal getCodTipOperBaixa() {
        return codTipOperBaixa;
   }

   public void setCodTipOperBaixa(BigDecimal codTipOperBaixa) {
        markAsChanged("CODTIPOPERBAIXA", codTipOperBaixa);
        this.codTipOperBaixa = codTipOperBaixa;
   }

   @Override
   public String getTableName() {
        return "TGFCLX";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoLancamentoExtrato";
   }

   @Override
   public ConfiguracaoLancamentoExtrato fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.catLanc = vo.asBigDecimal("CATLANC");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLanc = vo.asBigDecimal("CODLANC");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipTit = vo.asBigDecimal("CODTIPTIT");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.hist = vo.asString("HIST");
        this.tipoTransacao = vo.asString("TIPOTRANSACAO");
        this.codTipOperBaixa = vo.asBigDecimal("CODTIPOPERBAIXA");
        return this;
   }
}
