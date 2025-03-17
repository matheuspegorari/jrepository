package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemConferencia extends AbstractSankhyaEntity<ItemConferencia> {
   private String aceitarDif;
   private String codBarra;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private String codVolCompra;
   private BigDecimal codVolume;
   private String controle;
   private Timestamp dhAlter;
   private Timestamp dtVal;
   private Timestamp dtValMin;
   private String ignorar;
   private BigDecimal nuConferencia;
   private BigDecimal qtdAvaria;
   private BigDecimal qtdeConf;
   private String recontagem;
   private BigDecimal sequencia;
   private String tipoVolume;
   private BigDecimal codMdiv;
   private BigDecimal qtdeDif;
   private BigDecimal codUsuDiv;
   private String devolver;
   private String receberAvaria;
   private BigDecimal qtdPecas;

   public String getAceitarDif() {
        return aceitarDif;
   }

   public void setAceitarDif(String aceitarDif) {
        this.aceitarDif = aceitarDif;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodVolCompra() {
        return codVolCompra;
   }

   public void setCodVolCompra(String codVolCompra) {
        this.codVolCompra = codVolCompra;
   }

   public BigDecimal getCodVolume() {
        return codVolume;
   }

   public void setCodVolume(BigDecimal codVolume) {
        this.codVolume = codVolume;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        this.dtVal = dtVal;
   }

   public Timestamp getDtValMin() {
        return dtValMin;
   }

   public void setDtValMin(Timestamp dtValMin) {
        this.dtValMin = dtValMin;
   }

   public String getIgnorar() {
        return ignorar;
   }

   public void setIgnorar(String ignorar) {
        this.ignorar = ignorar;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        this.nuConferencia = nuConferencia;
   }

   public BigDecimal getQtdAvaria() {
        return qtdAvaria;
   }

   public void setQtdAvaria(BigDecimal qtdAvaria) {
        this.qtdAvaria = qtdAvaria;
   }

   public BigDecimal getQtdeConf() {
        return qtdeConf;
   }

   public void setQtdeConf(BigDecimal qtdeConf) {
        this.qtdeConf = qtdeConf;
   }

   public String getRecontagem() {
        return recontagem;
   }

   public void setRecontagem(String recontagem) {
        this.recontagem = recontagem;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipoVolume() {
        return tipoVolume;
   }

   public void setTipoVolume(String tipoVolume) {
        this.tipoVolume = tipoVolume;
   }

   public BigDecimal getCodMdiv() {
        return codMdiv;
   }

   public void setCodMdiv(BigDecimal codMdiv) {
        this.codMdiv = codMdiv;
   }

   public BigDecimal getQtdeDif() {
        return qtdeDif;
   }

   public void setQtdeDif(BigDecimal qtdeDif) {
        this.qtdeDif = qtdeDif;
   }

   public BigDecimal getCodUsuDiv() {
        return codUsuDiv;
   }

   public void setCodUsuDiv(BigDecimal codUsuDiv) {
        this.codUsuDiv = codUsuDiv;
   }

   public String getDevolver() {
        return devolver;
   }

   public void setDevolver(String devolver) {
        this.devolver = devolver;
   }

   public String getReceberAvaria() {
        return receberAvaria;
   }

   public void setReceberAvaria(String receberAvaria) {
        this.receberAvaria = receberAvaria;
   }

   public BigDecimal getQtdPecas() {
        return qtdPecas;
   }

   public void setQtdPecas(BigDecimal qtdPecas) {
        this.qtdPecas = qtdPecas;
   }

   @Override
   public String getTableName() {
        return "TGWCOI";
   }

   @Override
   public String getEntityName() {
        return "ItemConferencia";
   }

   @Override
   public ItemConferencia fromVO(DynamicVO vo) {
        this.aceitarDif = vo.asString("ACEITARDIF");
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVolCompra = vo.asString("CODVOLCOMPRA");
        this.codVolume = vo.asBigDecimal("CODVOLUME");
        this.controle = vo.asString("CONTROLE");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.dtValMin = vo.asTimestamp("DTVALMIN");
        this.ignorar = vo.asString("IGNORAR");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.qtdAvaria = vo.asBigDecimal("QTDAVARIA");
        this.qtdeConf = vo.asBigDecimal("QTDECONF");
        this.recontagem = vo.asString("RECONTAGEM");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoVolume = vo.asString("TIPOVOLUME");
        this.codMdiv = vo.asBigDecimal("CODMDIV");
        this.qtdeDif = vo.asBigDecimal("QTDEDIF");
        this.codUsuDiv = vo.asBigDecimal("CODUSUDIV");
        this.devolver = vo.asString("DEVOLVER");
        this.receberAvaria = vo.asString("RECEBERAVARIA");
        this.qtdPecas = vo.asBigDecimal("QTDPECAS");
        return this;
   }
}
