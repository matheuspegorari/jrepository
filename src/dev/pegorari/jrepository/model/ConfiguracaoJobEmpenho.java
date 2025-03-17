package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoJobEmpenho implements SankhyaEntity<ConfiguracaoJobEmpenho> {

   private String ativo;
   private BigDecimal codEmp;
   private BigDecimal codParcCompra;
   private BigDecimal codParcTranspCompra;
   private BigDecimal codParcTranspVenda;
   private BigDecimal codParcVenda;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String email;
   private String expGatilho;
   private BigDecimal nuConf;
   private BigDecimal regiaoCompra;
   private BigDecimal regiaoVenda;
   private String tipGatilho;
   private String tipIntervalo;
   private BigDecimal topCompra;
   private BigDecimal topVenda;
   private BigDecimal vlrIntervalo;
   private char[] filtroCompra;
   private char[] filtroVenda;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParcCompra() {
        return codParcCompra;
   }

   public void setCodParcCompra(BigDecimal codParcCompra) {
        this.codParcCompra = codParcCompra;
   }

   public BigDecimal getCodParcTranspCompra() {
        return codParcTranspCompra;
   }

   public void setCodParcTranspCompra(BigDecimal codParcTranspCompra) {
        this.codParcTranspCompra = codParcTranspCompra;
   }

   public BigDecimal getCodParcTranspVenda() {
        return codParcTranspVenda;
   }

   public void setCodParcTranspVenda(BigDecimal codParcTranspVenda) {
        this.codParcTranspVenda = codParcTranspVenda;
   }

   public BigDecimal getCodParcVenda() {
        return codParcVenda;
   }

   public void setCodParcVenda(BigDecimal codParcVenda) {
        this.codParcVenda = codParcVenda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getExpGatilho() {
        return expGatilho;
   }

   public void setExpGatilho(String expGatilho) {
        this.expGatilho = expGatilho;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        this.nuConf = nuConf;
   }

   public BigDecimal getRegiaoCompra() {
        return regiaoCompra;
   }

   public void setRegiaoCompra(BigDecimal regiaoCompra) {
        this.regiaoCompra = regiaoCompra;
   }

   public BigDecimal getRegiaoVenda() {
        return regiaoVenda;
   }

   public void setRegiaoVenda(BigDecimal regiaoVenda) {
        this.regiaoVenda = regiaoVenda;
   }

   public String getTipGatilho() {
        return tipGatilho;
   }

   public void setTipGatilho(String tipGatilho) {
        this.tipGatilho = tipGatilho;
   }

   public String getTipIntervalo() {
        return tipIntervalo;
   }

   public void setTipIntervalo(String tipIntervalo) {
        this.tipIntervalo = tipIntervalo;
   }

   public BigDecimal getTopCompra() {
        return topCompra;
   }

   public void setTopCompra(BigDecimal topCompra) {
        this.topCompra = topCompra;
   }

   public BigDecimal getTopVenda() {
        return topVenda;
   }

   public void setTopVenda(BigDecimal topVenda) {
        this.topVenda = topVenda;
   }

   public BigDecimal getVlrIntervalo() {
        return vlrIntervalo;
   }

   public void setVlrIntervalo(BigDecimal vlrIntervalo) {
        this.vlrIntervalo = vlrIntervalo;
   }

   public char[] getFiltroCompra() {
        return filtroCompra;
   }

   public void setFiltroCompra(char[] filtroCompra) {
        this.filtroCompra = filtroCompra;
   }

   public char[] getFiltroVenda() {
        return filtroVenda;
   }

   public void setFiltroVenda(char[] filtroVenda) {
        this.filtroVenda = filtroVenda;
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoJobEmpenho";
   }

   @Override
   public ConfiguracaoJobEmpenho fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParcCompra = vo.asBigDecimal("CODPARCCOMPRA");
        this.codParcTranspCompra = vo.asBigDecimal("CODPARCTRANSPCOMPRA");
        this.codParcTranspVenda = vo.asBigDecimal("CODPARCTRANSPVENDA");
        this.codParcVenda = vo.asBigDecimal("CODPARCVENDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.email = vo.asString("EMAIL");
        this.expGatilho = vo.asString("EXPGATILHO");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.regiaoCompra = vo.asBigDecimal("REGIAOCOMPRA");
        this.regiaoVenda = vo.asBigDecimal("REGIAOVENDA");
        this.tipGatilho = vo.asString("TIPGATILHO");
        this.tipIntervalo = vo.asString("TIPINTERVALO");
        this.topCompra = vo.asBigDecimal("TOPCOMPRA");
        this.topVenda = vo.asBigDecimal("TOPVENDA");
        this.vlrIntervalo = vo.asBigDecimal("VLRINTERVALO");
        this.filtroCompra = vo.asClob("FILTROCOMPRA");
        this.filtroVenda = vo.asClob("FILTROVENDA");
        return this;
   }
}
