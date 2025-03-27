package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoLancamentoExtrato extends AbstractSankhyaEntity<ConfiguracaoLancamentoExtrato> {
   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCatLanc() {
        return this.getVo().asBigDecimal("CATLANC");
   }

   public void setCatLanc(BigDecimal catLanc) {
        markAsChanged("CATLANC", catLanc);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLanc() {
        return this.getVo().asBigDecimal("CODLANC");
   }

   public void setCodLanc(BigDecimal codLanc) {
        markAsChanged("CODLANC", codLanc);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipTit() {
        return this.getVo().asBigDecimal("CODTIPTIT");
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
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

   public String getHist() {
        return this.getVo().asString("HIST");
   }

   public void setHist(String hist) {
        markAsChanged("HIST", hist);
   }

   public String getTipoTransacao() {
        return this.getVo().asString("TIPOTRANSACAO");
   }

   public void setTipoTransacao(String tipoTransacao) {
        markAsChanged("TIPOTRANSACAO", tipoTransacao);
   }

   public BigDecimal getCodTipOperBaixa() {
        return this.getVo().asBigDecimal("CODTIPOPERBAIXA");
   }

   public void setCodTipOperBaixa(BigDecimal codTipOperBaixa) {
        markAsChanged("CODTIPOPERBAIXA", codTipOperBaixa);
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
        this.setVo(vo);
        return this;
   }
}
