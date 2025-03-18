package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoJobEmpenho extends AbstractSankhyaEntity<ConfiguracaoJobEmpenho> {
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
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParcCompra() {
        return codParcCompra;
   }

   public void setCodParcCompra(BigDecimal codParcCompra) {
        markAsChanged("CODPARCCOMPRA", codParcCompra);
        this.codParcCompra = codParcCompra;
   }

   public BigDecimal getCodParcTranspCompra() {
        return codParcTranspCompra;
   }

   public void setCodParcTranspCompra(BigDecimal codParcTranspCompra) {
        markAsChanged("CODPARCTRANSPCOMPRA", codParcTranspCompra);
        this.codParcTranspCompra = codParcTranspCompra;
   }

   public BigDecimal getCodParcTranspVenda() {
        return codParcTranspVenda;
   }

   public void setCodParcTranspVenda(BigDecimal codParcTranspVenda) {
        markAsChanged("CODPARCTRANSPVENDA", codParcTranspVenda);
        this.codParcTranspVenda = codParcTranspVenda;
   }

   public BigDecimal getCodParcVenda() {
        return codParcVenda;
   }

   public void setCodParcVenda(BigDecimal codParcVenda) {
        markAsChanged("CODPARCVENDA", codParcVenda);
        this.codParcVenda = codParcVenda;
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

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getExpGatilho() {
        return expGatilho;
   }

   public void setExpGatilho(String expGatilho) {
        markAsChanged("EXPGATILHO", expGatilho);
        this.expGatilho = expGatilho;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   public BigDecimal getRegiaoCompra() {
        return regiaoCompra;
   }

   public void setRegiaoCompra(BigDecimal regiaoCompra) {
        markAsChanged("REGIAOCOMPRA", regiaoCompra);
        this.regiaoCompra = regiaoCompra;
   }

   public BigDecimal getRegiaoVenda() {
        return regiaoVenda;
   }

   public void setRegiaoVenda(BigDecimal regiaoVenda) {
        markAsChanged("REGIAOVENDA", regiaoVenda);
        this.regiaoVenda = regiaoVenda;
   }

   public String getTipGatilho() {
        return tipGatilho;
   }

   public void setTipGatilho(String tipGatilho) {
        markAsChanged("TIPGATILHO", tipGatilho);
        this.tipGatilho = tipGatilho;
   }

   public String getTipIntervalo() {
        return tipIntervalo;
   }

   public void setTipIntervalo(String tipIntervalo) {
        markAsChanged("TIPINTERVALO", tipIntervalo);
        this.tipIntervalo = tipIntervalo;
   }

   public BigDecimal getTopCompra() {
        return topCompra;
   }

   public void setTopCompra(BigDecimal topCompra) {
        markAsChanged("TOPCOMPRA", topCompra);
        this.topCompra = topCompra;
   }

   public BigDecimal getTopVenda() {
        return topVenda;
   }

   public void setTopVenda(BigDecimal topVenda) {
        markAsChanged("TOPVENDA", topVenda);
        this.topVenda = topVenda;
   }

   public BigDecimal getVlrIntervalo() {
        return vlrIntervalo;
   }

   public void setVlrIntervalo(BigDecimal vlrIntervalo) {
        markAsChanged("VLRINTERVALO", vlrIntervalo);
        this.vlrIntervalo = vlrIntervalo;
   }

   public char[] getFiltroCompra() {
        return filtroCompra;
   }

   public void setFiltroCompra(char[] filtroCompra) {
        markAsChanged("FILTROCOMPRA", filtroCompra);
        this.filtroCompra = filtroCompra;
   }

   public char[] getFiltroVenda() {
        return filtroVenda;
   }

   public void setFiltroVenda(char[] filtroVenda) {
        markAsChanged("FILTROVENDA", filtroVenda);
        this.filtroVenda = filtroVenda;
   }

   @Override
   public String getTableName() {
        return "TGWCONFEMPE";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoJobEmpenho";
   }

   @Override
   public ConfiguracaoJobEmpenho fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
