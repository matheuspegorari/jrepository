package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PartilhaSimplesNacional extends AbstractSankhyaEntity<PartilhaSimplesNacional> {
   private BigDecimal aliqCofins;
   private BigDecimal aliqCpp;
   private BigDecimal aliqCsll;
   private BigDecimal aliqIcms;
   private BigDecimal aliqIpi;
   private BigDecimal aliqIrpj;
   private BigDecimal aliqIss;
   private BigDecimal aliqPisPasep;
   private BigDecimal aliquota;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuPartilha;
   private BigDecimal tipoSn;
   private BigDecimal vlrRecBruta;
   private String tipoMercado;
   private BigDecimal nuFaixa;
   private BigDecimal nuApuracao;
   private BigDecimal aliqCofinsAliefe;
   private BigDecimal aliqCppAliefe;
   private BigDecimal aliqCsllAliefe;
   private BigDecimal aliqIcmsAliefe;
   private BigDecimal aliqIpiAliefe;
   private BigDecimal aliqIrpjAliefe;
   private BigDecimal aliqIssAliefe;
   private BigDecimal aliqPisPasepAliefe;
   private BigDecimal aliquotaAliefe;
   private BigDecimal nuFaixaAliefe;
   private String tipoMercadoAliefe;
   private BigDecimal tipoSnAliefe;
   private BigDecimal vlrRecBrutaAliefe;

   public BigDecimal getAliqCofins() {
        return aliqCofins;
   }

   public void setAliqCofins(BigDecimal aliqCofins) {
        markAsChanged("ALIQCOFINS", aliqCofins);
        this.aliqCofins = aliqCofins;
   }

   public BigDecimal getAliqCpp() {
        return aliqCpp;
   }

   public void setAliqCpp(BigDecimal aliqCpp) {
        markAsChanged("ALIQCPP", aliqCpp);
        this.aliqCpp = aliqCpp;
   }

   public BigDecimal getAliqCsll() {
        return aliqCsll;
   }

   public void setAliqCsll(BigDecimal aliqCsll) {
        markAsChanged("ALIQCSLL", aliqCsll);
        this.aliqCsll = aliqCsll;
   }

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqIpi() {
        return aliqIpi;
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
        this.aliqIpi = aliqIpi;
   }

   public BigDecimal getAliqIrpj() {
        return aliqIrpj;
   }

   public void setAliqIrpj(BigDecimal aliqIrpj) {
        markAsChanged("ALIQIRPJ", aliqIrpj);
        this.aliqIrpj = aliqIrpj;
   }

   public BigDecimal getAliqIss() {
        return aliqIss;
   }

   public void setAliqIss(BigDecimal aliqIss) {
        markAsChanged("ALIQISS", aliqIss);
        this.aliqIss = aliqIss;
   }

   public BigDecimal getAliqPisPasep() {
        return aliqPisPasep;
   }

   public void setAliqPisPasep(BigDecimal aliqPisPasep) {
        markAsChanged("ALIQPISPASEP", aliqPisPasep);
        this.aliqPisPasep = aliqPisPasep;
   }

   public BigDecimal getAliquota() {
        return aliquota;
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
        this.aliquota = aliquota;
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

   public BigDecimal getNuPartilha() {
        return nuPartilha;
   }

   public void setNuPartilha(BigDecimal nuPartilha) {
        markAsChanged("NUPARTILHA", nuPartilha);
        this.nuPartilha = nuPartilha;
   }

   public BigDecimal getTipoSn() {
        return tipoSn;
   }

   public void setTipoSn(BigDecimal tipoSn) {
        markAsChanged("TIPOSN", tipoSn);
        this.tipoSn = tipoSn;
   }

   public BigDecimal getVlrRecBruta() {
        return vlrRecBruta;
   }

   public void setVlrRecBruta(BigDecimal vlrRecBruta) {
        markAsChanged("VLRRECBRUTA", vlrRecBruta);
        this.vlrRecBruta = vlrRecBruta;
   }

   public String getTipoMercado() {
        return tipoMercado;
   }

   public void setTipoMercado(String tipoMercado) {
        markAsChanged("TIPOMERCADO", tipoMercado);
        this.tipoMercado = tipoMercado;
   }

   public BigDecimal getNuFaixa() {
        return nuFaixa;
   }

   public void setNuFaixa(BigDecimal nuFaixa) {
        markAsChanged("NUFAIXA", nuFaixa);
        this.nuFaixa = nuFaixa;
   }

   public BigDecimal getNuApuracao() {
        return nuApuracao;
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
        this.nuApuracao = nuApuracao;
   }

   public BigDecimal getAliqCofinsAliefe() {
        return aliqCofinsAliefe;
   }

   public void setAliqCofinsAliefe(BigDecimal aliqCofinsAliefe) {
        markAsChanged("ALIQCOFINSALIEFE", aliqCofinsAliefe);
        this.aliqCofinsAliefe = aliqCofinsAliefe;
   }

   public BigDecimal getAliqCppAliefe() {
        return aliqCppAliefe;
   }

   public void setAliqCppAliefe(BigDecimal aliqCppAliefe) {
        markAsChanged("ALIQCPPALIEFE", aliqCppAliefe);
        this.aliqCppAliefe = aliqCppAliefe;
   }

   public BigDecimal getAliqCsllAliefe() {
        return aliqCsllAliefe;
   }

   public void setAliqCsllAliefe(BigDecimal aliqCsllAliefe) {
        markAsChanged("ALIQCSLLALIEFE", aliqCsllAliefe);
        this.aliqCsllAliefe = aliqCsllAliefe;
   }

   public BigDecimal getAliqIcmsAliefe() {
        return aliqIcmsAliefe;
   }

   public void setAliqIcmsAliefe(BigDecimal aliqIcmsAliefe) {
        markAsChanged("ALIQICMSALIEFE", aliqIcmsAliefe);
        this.aliqIcmsAliefe = aliqIcmsAliefe;
   }

   public BigDecimal getAliqIpiAliefe() {
        return aliqIpiAliefe;
   }

   public void setAliqIpiAliefe(BigDecimal aliqIpiAliefe) {
        markAsChanged("ALIQIPIALIEFE", aliqIpiAliefe);
        this.aliqIpiAliefe = aliqIpiAliefe;
   }

   public BigDecimal getAliqIrpjAliefe() {
        return aliqIrpjAliefe;
   }

   public void setAliqIrpjAliefe(BigDecimal aliqIrpjAliefe) {
        markAsChanged("ALIQIRPJALIEFE", aliqIrpjAliefe);
        this.aliqIrpjAliefe = aliqIrpjAliefe;
   }

   public BigDecimal getAliqIssAliefe() {
        return aliqIssAliefe;
   }

   public void setAliqIssAliefe(BigDecimal aliqIssAliefe) {
        markAsChanged("ALIQISSALIEFE", aliqIssAliefe);
        this.aliqIssAliefe = aliqIssAliefe;
   }

   public BigDecimal getAliqPisPasepAliefe() {
        return aliqPisPasepAliefe;
   }

   public void setAliqPisPasepAliefe(BigDecimal aliqPisPasepAliefe) {
        markAsChanged("ALIQPISPASEPALIEFE", aliqPisPasepAliefe);
        this.aliqPisPasepAliefe = aliqPisPasepAliefe;
   }

   public BigDecimal getAliquotaAliefe() {
        return aliquotaAliefe;
   }

   public void setAliquotaAliefe(BigDecimal aliquotaAliefe) {
        markAsChanged("ALIQUOTAALIEFE", aliquotaAliefe);
        this.aliquotaAliefe = aliquotaAliefe;
   }

   public BigDecimal getNuFaixaAliefe() {
        return nuFaixaAliefe;
   }

   public void setNuFaixaAliefe(BigDecimal nuFaixaAliefe) {
        markAsChanged("NUFAIXAALIEFE", nuFaixaAliefe);
        this.nuFaixaAliefe = nuFaixaAliefe;
   }

   public String getTipoMercadoAliefe() {
        return tipoMercadoAliefe;
   }

   public void setTipoMercadoAliefe(String tipoMercadoAliefe) {
        markAsChanged("TIPOMERCADOALIEFE", tipoMercadoAliefe);
        this.tipoMercadoAliefe = tipoMercadoAliefe;
   }

   public BigDecimal getTipoSnAliefe() {
        return tipoSnAliefe;
   }

   public void setTipoSnAliefe(BigDecimal tipoSnAliefe) {
        markAsChanged("TIPOSNALIEFE", tipoSnAliefe);
        this.tipoSnAliefe = tipoSnAliefe;
   }

   public BigDecimal getVlrRecBrutaAliefe() {
        return vlrRecBrutaAliefe;
   }

   public void setVlrRecBrutaAliefe(BigDecimal vlrRecBrutaAliefe) {
        markAsChanged("VLRRECBRUTAALIEFE", vlrRecBrutaAliefe);
        this.vlrRecBrutaAliefe = vlrRecBrutaAliefe;
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
        this.setOriginalVO(vo);
        this.aliqCofins = vo.asBigDecimal("ALIQCOFINS");
        this.aliqCpp = vo.asBigDecimal("ALIQCPP");
        this.aliqCsll = vo.asBigDecimal("ALIQCSLL");
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqIpi = vo.asBigDecimal("ALIQIPI");
        this.aliqIrpj = vo.asBigDecimal("ALIQIRPJ");
        this.aliqIss = vo.asBigDecimal("ALIQISS");
        this.aliqPisPasep = vo.asBigDecimal("ALIQPISPASEP");
        this.aliquota = vo.asBigDecimal("ALIQUOTA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuPartilha = vo.asBigDecimal("NUPARTILHA");
        this.tipoSn = vo.asBigDecimal("TIPOSN");
        this.vlrRecBruta = vo.asBigDecimal("VLRRECBRUTA");
        this.tipoMercado = vo.asString("TIPOMERCADO");
        this.nuFaixa = vo.asBigDecimal("NUFAIXA");
        this.nuApuracao = vo.asBigDecimal("NUAPURACAO");
        this.aliqCofinsAliefe = vo.asBigDecimal("ALIQCOFINSALIEFE");
        this.aliqCppAliefe = vo.asBigDecimal("ALIQCPPALIEFE");
        this.aliqCsllAliefe = vo.asBigDecimal("ALIQCSLLALIEFE");
        this.aliqIcmsAliefe = vo.asBigDecimal("ALIQICMSALIEFE");
        this.aliqIpiAliefe = vo.asBigDecimal("ALIQIPIALIEFE");
        this.aliqIrpjAliefe = vo.asBigDecimal("ALIQIRPJALIEFE");
        this.aliqIssAliefe = vo.asBigDecimal("ALIQISSALIEFE");
        this.aliqPisPasepAliefe = vo.asBigDecimal("ALIQPISPASEPALIEFE");
        this.aliquotaAliefe = vo.asBigDecimal("ALIQUOTAALIEFE");
        this.nuFaixaAliefe = vo.asBigDecimal("NUFAIXAALIEFE");
        this.tipoMercadoAliefe = vo.asString("TIPOMERCADOALIEFE");
        this.tipoSnAliefe = vo.asBigDecimal("TIPOSNALIEFE");
        this.vlrRecBrutaAliefe = vo.asBigDecimal("VLRRECBRUTAALIEFE");
        return this;
   }
}
