package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Pesagem extends AbstractSankhyaEntity<Pesagem> {
   private BigDecimal tara;
   private String variasNotas;
   private String nfTransp;
   private BigDecimal nuNota;
   private BigDecimal nuNotaDest;
   private BigDecimal nuPesagem;
   private BigDecimal pesoBruto;
   private BigDecimal balancaPb;
   private BigDecimal balancaTara;
   private BigDecimal codParcTransp;
   private BigDecimal codUsuPb;
   private BigDecimal codUsuTara;
   private BigDecimal codVeiculo;
   private Timestamp dhPesoBruto;
   private Timestamp dhTara;
   private BigDecimal pesoLiq;
   private String pesagemManual;
   private BigDecimal sequencia;

   public BigDecimal getTara() {
        return tara;
   }

   public void setTara(BigDecimal tara) {
        markAsChanged("TARA", tara);
        this.tara = tara;
   }

   public String getVariasNotas() {
        return variasNotas;
   }

   public void setVariasNotas(String variasNotas) {
        markAsChanged("VARIASNOTAS", variasNotas);
        this.variasNotas = variasNotas;
   }

   public String getNfTransp() {
        return nfTransp;
   }

   public void setNfTransp(String nfTransp) {
        markAsChanged("NFTRANSP", nfTransp);
        this.nfTransp = nfTransp;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaDest() {
        return nuNotaDest;
   }

   public void setNuNotaDest(BigDecimal nuNotaDest) {
        markAsChanged("NUNOTADEST", nuNotaDest);
        this.nuNotaDest = nuNotaDest;
   }

   public BigDecimal getNuPesagem() {
        return nuPesagem;
   }

   public void setNuPesagem(BigDecimal nuPesagem) {
        markAsChanged("NUPESAGEM", nuPesagem);
        this.nuPesagem = nuPesagem;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getBalancaPb() {
        return balancaPb;
   }

   public void setBalancaPb(BigDecimal balancaPb) {
        markAsChanged("BALANCAPB", balancaPb);
        this.balancaPb = balancaPb;
   }

   public BigDecimal getBalancaTara() {
        return balancaTara;
   }

   public void setBalancaTara(BigDecimal balancaTara) {
        markAsChanged("BALANCATARA", balancaTara);
        this.balancaTara = balancaTara;
   }

   public BigDecimal getCodParcTransp() {
        return codParcTransp;
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
        this.codParcTransp = codParcTransp;
   }

   public BigDecimal getCodUsuPb() {
        return codUsuPb;
   }

   public void setCodUsuPb(BigDecimal codUsuPb) {
        markAsChanged("CODUSUPB", codUsuPb);
        this.codUsuPb = codUsuPb;
   }

   public BigDecimal getCodUsuTara() {
        return codUsuTara;
   }

   public void setCodUsuTara(BigDecimal codUsuTara) {
        markAsChanged("CODUSUTARA", codUsuTara);
        this.codUsuTara = codUsuTara;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
        this.codVeiculo = codVeiculo;
   }

   public Timestamp getDhPesoBruto() {
        return dhPesoBruto;
   }

   public void setDhPesoBruto(Timestamp dhPesoBruto) {
        markAsChanged("DHPESOBRUTO", dhPesoBruto);
        this.dhPesoBruto = dhPesoBruto;
   }

   public Timestamp getDhTara() {
        return dhTara;
   }

   public void setDhTara(Timestamp dhTara) {
        markAsChanged("DHTARA", dhTara);
        this.dhTara = dhTara;
   }

   public BigDecimal getPesoLiq() {
        return pesoLiq;
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
        this.pesoLiq = pesoLiq;
   }

   public String getPesagemManual() {
        return pesagemManual;
   }

   public void setPesagemManual(String pesagemManual) {
        markAsChanged("PESAGEMMANUAL", pesagemManual);
        this.pesagemManual = pesagemManual;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TGAPCA";
   }

   @Override
   public String getEntityName() {
        return "Pesagem";
   }

   @Override
   public Pesagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.tara = vo.asBigDecimal("TARA");
        this.variasNotas = vo.asString("VARIASNOTAS");
        this.nfTransp = vo.asString("NFTRANSP");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaDest = vo.asBigDecimal("NUNOTADEST");
        this.nuPesagem = vo.asBigDecimal("NUPESAGEM");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.balancaPb = vo.asBigDecimal("BALANCAPB");
        this.balancaTara = vo.asBigDecimal("BALANCATARA");
        this.codParcTransp = vo.asBigDecimal("CODPARCTRANSP");
        this.codUsuPb = vo.asBigDecimal("CODUSUPB");
        this.codUsuTara = vo.asBigDecimal("CODUSUTARA");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.dhPesoBruto = vo.asTimestamp("DHPESOBRUTO");
        this.dhTara = vo.asTimestamp("DHTARA");
        this.pesoLiq = vo.asBigDecimal("PESOLIQ");
        this.pesagemManual = vo.asString("PESAGEMMANUAL");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
