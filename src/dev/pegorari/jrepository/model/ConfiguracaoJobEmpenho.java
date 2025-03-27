package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoJobEmpenho extends AbstractSankhyaEntity<ConfiguracaoJobEmpenho> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodParcCompra() {
        return this.getVo().asBigDecimal("CODPARCCOMPRA");
   }

   public void setCodParcCompra(BigDecimal codParcCompra) {
        markAsChanged("CODPARCCOMPRA", codParcCompra);
   }

   public BigDecimal getCodParcTranspCompra() {
        return this.getVo().asBigDecimal("CODPARCTRANSPCOMPRA");
   }

   public void setCodParcTranspCompra(BigDecimal codParcTranspCompra) {
        markAsChanged("CODPARCTRANSPCOMPRA", codParcTranspCompra);
   }

   public BigDecimal getCodParcTranspVenda() {
        return this.getVo().asBigDecimal("CODPARCTRANSPVENDA");
   }

   public void setCodParcTranspVenda(BigDecimal codParcTranspVenda) {
        markAsChanged("CODPARCTRANSPVENDA", codParcTranspVenda);
   }

   public BigDecimal getCodParcVenda() {
        return this.getVo().asBigDecimal("CODPARCVENDA");
   }

   public void setCodParcVenda(BigDecimal codParcVenda) {
        markAsChanged("CODPARCVENDA", codParcVenda);
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

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getExpGatilho() {
        return this.getVo().asString("EXPGATILHO");
   }

   public void setExpGatilho(String expGatilho) {
        markAsChanged("EXPGATILHO", expGatilho);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public BigDecimal getRegiaoCompra() {
        return this.getVo().asBigDecimal("REGIAOCOMPRA");
   }

   public void setRegiaoCompra(BigDecimal regiaoCompra) {
        markAsChanged("REGIAOCOMPRA", regiaoCompra);
   }

   public BigDecimal getRegiaoVenda() {
        return this.getVo().asBigDecimal("REGIAOVENDA");
   }

   public void setRegiaoVenda(BigDecimal regiaoVenda) {
        markAsChanged("REGIAOVENDA", regiaoVenda);
   }

   public String getTipGatilho() {
        return this.getVo().asString("TIPGATILHO");
   }

   public void setTipGatilho(String tipGatilho) {
        markAsChanged("TIPGATILHO", tipGatilho);
   }

   public String getTipIntervalo() {
        return this.getVo().asString("TIPINTERVALO");
   }

   public void setTipIntervalo(String tipIntervalo) {
        markAsChanged("TIPINTERVALO", tipIntervalo);
   }

   public BigDecimal getTopCompra() {
        return this.getVo().asBigDecimal("TOPCOMPRA");
   }

   public void setTopCompra(BigDecimal topCompra) {
        markAsChanged("TOPCOMPRA", topCompra);
   }

   public BigDecimal getTopVenda() {
        return this.getVo().asBigDecimal("TOPVENDA");
   }

   public void setTopVenda(BigDecimal topVenda) {
        markAsChanged("TOPVENDA", topVenda);
   }

   public BigDecimal getVlrIntervalo() {
        return this.getVo().asBigDecimal("VLRINTERVALO");
   }

   public void setVlrIntervalo(BigDecimal vlrIntervalo) {
        markAsChanged("VLRINTERVALO", vlrIntervalo);
   }

   public char[] getFiltroCompra() {
        return this.getVo().asClob("FILTROCOMPRA");
   }

   public void setFiltroCompra(char[] filtroCompra) {
        markAsChanged("FILTROCOMPRA", filtroCompra);
   }

   public char[] getFiltroVenda() {
        return this.getVo().asClob("FILTROVENDA");
   }

   public void setFiltroVenda(char[] filtroVenda) {
        markAsChanged("FILTROVENDA", filtroVenda);
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
        this.setVo(vo);
        return this;
   }
}
