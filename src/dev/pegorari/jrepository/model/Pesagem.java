package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Pesagem extends AbstractSankhyaEntity<Pesagem> {
   public BigDecimal getTara() {
        return this.getVo().asBigDecimal("TARA");
   }

   public void setTara(BigDecimal tara) {
        markAsChanged("TARA", tara);
   }

   public String getVariasNotas() {
        return this.getVo().asString("VARIASNOTAS");
   }

   public void setVariasNotas(String variasNotas) {
        markAsChanged("VARIASNOTAS", variasNotas);
   }

   public String getNfTransp() {
        return this.getVo().asString("NFTRANSP");
   }

   public void setNfTransp(String nfTransp) {
        markAsChanged("NFTRANSP", nfTransp);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuNotaDest() {
        return this.getVo().asBigDecimal("NUNOTADEST");
   }

   public void setNuNotaDest(BigDecimal nuNotaDest) {
        markAsChanged("NUNOTADEST", nuNotaDest);
   }

   public BigDecimal getNuPesagem() {
        return this.getVo().asBigDecimal("NUPESAGEM");
   }

   public void setNuPesagem(BigDecimal nuPesagem) {
        markAsChanged("NUPESAGEM", nuPesagem);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getBalancaPb() {
        return this.getVo().asBigDecimal("BALANCAPB");
   }

   public void setBalancaPb(BigDecimal balancaPb) {
        markAsChanged("BALANCAPB", balancaPb);
   }

   public BigDecimal getBalancaTara() {
        return this.getVo().asBigDecimal("BALANCATARA");
   }

   public void setBalancaTara(BigDecimal balancaTara) {
        markAsChanged("BALANCATARA", balancaTara);
   }

   public BigDecimal getCodParcTransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
   }

   public BigDecimal getCodUsuPb() {
        return this.getVo().asBigDecimal("CODUSUPB");
   }

   public void setCodUsuPb(BigDecimal codUsuPb) {
        markAsChanged("CODUSUPB", codUsuPb);
   }

   public BigDecimal getCodUsuTara() {
        return this.getVo().asBigDecimal("CODUSUTARA");
   }

   public void setCodUsuTara(BigDecimal codUsuTara) {
        markAsChanged("CODUSUTARA", codUsuTara);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public Timestamp getDhPesoBruto() {
        return this.getVo().asTimestamp("DHPESOBRUTO");
   }

   public void setDhPesoBruto(Timestamp dhPesoBruto) {
        markAsChanged("DHPESOBRUTO", dhPesoBruto);
   }

   public Timestamp getDhTara() {
        return this.getVo().asTimestamp("DHTARA");
   }

   public void setDhTara(Timestamp dhTara) {
        markAsChanged("DHTARA", dhTara);
   }

   public BigDecimal getPesoLiq() {
        return this.getVo().asBigDecimal("PESOLIQ");
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
   }

   public String getPesagemManual() {
        return this.getVo().asString("PESAGEMMANUAL");
   }

   public void setPesagemManual(String pesagemManual) {
        markAsChanged("PESAGEMMANUAL", pesagemManual);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
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
        return this;
   }
}
