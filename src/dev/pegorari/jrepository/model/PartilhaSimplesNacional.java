package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PartilhaSimplesNacional extends AbstractSankhyaEntity<PartilhaSimplesNacional> {
   public BigDecimal getAliqCofins() {
        return this.getVo().asBigDecimal("ALIQCOFINS");
   }

   public void setAliqCofins(BigDecimal aliqCofins) {
        markAsChanged("ALIQCOFINS", aliqCofins);
   }

   public BigDecimal getAliqCpp() {
        return this.getVo().asBigDecimal("ALIQCPP");
   }

   public void setAliqCpp(BigDecimal aliqCpp) {
        markAsChanged("ALIQCPP", aliqCpp);
   }

   public BigDecimal getAliqCsll() {
        return this.getVo().asBigDecimal("ALIQCSLL");
   }

   public void setAliqCsll(BigDecimal aliqCsll) {
        markAsChanged("ALIQCSLL", aliqCsll);
   }

   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getAliqIpi() {
        return this.getVo().asBigDecimal("ALIQIPI");
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
   }

   public BigDecimal getAliqIrpj() {
        return this.getVo().asBigDecimal("ALIQIRPJ");
   }

   public void setAliqIrpj(BigDecimal aliqIrpj) {
        markAsChanged("ALIQIRPJ", aliqIrpj);
   }

   public BigDecimal getAliqIss() {
        return this.getVo().asBigDecimal("ALIQISS");
   }

   public void setAliqIss(BigDecimal aliqIss) {
        markAsChanged("ALIQISS", aliqIss);
   }

   public BigDecimal getAliqPisPasep() {
        return this.getVo().asBigDecimal("ALIQPISPASEP");
   }

   public void setAliqPisPasep(BigDecimal aliqPisPasep) {
        markAsChanged("ALIQPISPASEP", aliqPisPasep);
   }

   public BigDecimal getAliquota() {
        return this.getVo().asBigDecimal("ALIQUOTA");
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
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

   public BigDecimal getNuPartilha() {
        return this.getVo().asBigDecimal("NUPARTILHA");
   }

   public void setNuPartilha(BigDecimal nuPartilha) {
        markAsChanged("NUPARTILHA", nuPartilha);
   }

   public BigDecimal getTipoSn() {
        return this.getVo().asBigDecimal("TIPOSN");
   }

   public void setTipoSn(BigDecimal tipoSn) {
        markAsChanged("TIPOSN", tipoSn);
   }

   public BigDecimal getVlrRecBruta() {
        return this.getVo().asBigDecimal("VLRRECBRUTA");
   }

   public void setVlrRecBruta(BigDecimal vlrRecBruta) {
        markAsChanged("VLRRECBRUTA", vlrRecBruta);
   }

   public String getTipoMercado() {
        return this.getVo().asString("TIPOMERCADO");
   }

   public void setTipoMercado(String tipoMercado) {
        markAsChanged("TIPOMERCADO", tipoMercado);
   }

   public BigDecimal getNuFaixa() {
        return this.getVo().asBigDecimal("NUFAIXA");
   }

   public void setNuFaixa(BigDecimal nuFaixa) {
        markAsChanged("NUFAIXA", nuFaixa);
   }

   public BigDecimal getNuApuracao() {
        return this.getVo().asBigDecimal("NUAPURACAO");
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
   }

   public BigDecimal getAliqCofinsAliefe() {
        return this.getVo().asBigDecimal("ALIQCOFINSALIEFE");
   }

   public void setAliqCofinsAliefe(BigDecimal aliqCofinsAliefe) {
        markAsChanged("ALIQCOFINSALIEFE", aliqCofinsAliefe);
   }

   public BigDecimal getAliqCppAliefe() {
        return this.getVo().asBigDecimal("ALIQCPPALIEFE");
   }

   public void setAliqCppAliefe(BigDecimal aliqCppAliefe) {
        markAsChanged("ALIQCPPALIEFE", aliqCppAliefe);
   }

   public BigDecimal getAliqCsllAliefe() {
        return this.getVo().asBigDecimal("ALIQCSLLALIEFE");
   }

   public void setAliqCsllAliefe(BigDecimal aliqCsllAliefe) {
        markAsChanged("ALIQCSLLALIEFE", aliqCsllAliefe);
   }

   public BigDecimal getAliqIcmsAliefe() {
        return this.getVo().asBigDecimal("ALIQICMSALIEFE");
   }

   public void setAliqIcmsAliefe(BigDecimal aliqIcmsAliefe) {
        markAsChanged("ALIQICMSALIEFE", aliqIcmsAliefe);
   }

   public BigDecimal getAliqIpiAliefe() {
        return this.getVo().asBigDecimal("ALIQIPIALIEFE");
   }

   public void setAliqIpiAliefe(BigDecimal aliqIpiAliefe) {
        markAsChanged("ALIQIPIALIEFE", aliqIpiAliefe);
   }

   public BigDecimal getAliqIrpjAliefe() {
        return this.getVo().asBigDecimal("ALIQIRPJALIEFE");
   }

   public void setAliqIrpjAliefe(BigDecimal aliqIrpjAliefe) {
        markAsChanged("ALIQIRPJALIEFE", aliqIrpjAliefe);
   }

   public BigDecimal getAliqIssAliefe() {
        return this.getVo().asBigDecimal("ALIQISSALIEFE");
   }

   public void setAliqIssAliefe(BigDecimal aliqIssAliefe) {
        markAsChanged("ALIQISSALIEFE", aliqIssAliefe);
   }

   public BigDecimal getAliqPisPasepAliefe() {
        return this.getVo().asBigDecimal("ALIQPISPASEPALIEFE");
   }

   public void setAliqPisPasepAliefe(BigDecimal aliqPisPasepAliefe) {
        markAsChanged("ALIQPISPASEPALIEFE", aliqPisPasepAliefe);
   }

   public BigDecimal getAliquotaAliefe() {
        return this.getVo().asBigDecimal("ALIQUOTAALIEFE");
   }

   public void setAliquotaAliefe(BigDecimal aliquotaAliefe) {
        markAsChanged("ALIQUOTAALIEFE", aliquotaAliefe);
   }

   public BigDecimal getNuFaixaAliefe() {
        return this.getVo().asBigDecimal("NUFAIXAALIEFE");
   }

   public void setNuFaixaAliefe(BigDecimal nuFaixaAliefe) {
        markAsChanged("NUFAIXAALIEFE", nuFaixaAliefe);
   }

   public String getTipoMercadoAliefe() {
        return this.getVo().asString("TIPOMERCADOALIEFE");
   }

   public void setTipoMercadoAliefe(String tipoMercadoAliefe) {
        markAsChanged("TIPOMERCADOALIEFE", tipoMercadoAliefe);
   }

   public BigDecimal getTipoSnAliefe() {
        return this.getVo().asBigDecimal("TIPOSNALIEFE");
   }

   public void setTipoSnAliefe(BigDecimal tipoSnAliefe) {
        markAsChanged("TIPOSNALIEFE", tipoSnAliefe);
   }

   public BigDecimal getVlrRecBrutaAliefe() {
        return this.getVo().asBigDecimal("VLRRECBRUTAALIEFE");
   }

   public void setVlrRecBrutaAliefe(BigDecimal vlrRecBrutaAliefe) {
        markAsChanged("VLRRECBRUTAALIEFE", vlrRecBrutaAliefe);
   }

   @Override
   public String getTableName() {
        return "TGFPSN";
   }

   @Override
   public String getEntityName() {
        return "PartilhaSimplesNacional";
   }

   @Override
   public PartilhaSimplesNacional fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
