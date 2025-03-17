package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoPlanejamentoEntrega implements SankhyaEntity<CabecalhoPlanejamentoEntrega> {

   private BigDecimal codCid;
   private BigDecimal codBai;
   private BigDecimal codEnd;
   private BigDecimal grupo;
   private BigDecimal nuNota;
   private BigDecimal codContato;
   private BigDecimal codParcFat;
   private BigDecimal distribuicaoContato;
   private BigDecimal numEnd;
   private BigDecimal codUsu;
   private BigDecimal nuPlan;
   private Timestamp dtAlter;
   private BigDecimal codReg;

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        this.codBai = codBai;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public BigDecimal getGrupo() {
        return grupo;
   }

   public void setGrupo(BigDecimal grupo) {
        this.grupo = grupo;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodParcFat() {
        return codParcFat;
   }

   public void setCodParcFat(BigDecimal codParcFat) {
        this.codParcFat = codParcFat;
   }

   public BigDecimal getDistribuicaoContato() {
        return distribuicaoContato;
   }

   public void setDistribuicaoContato(BigDecimal distribuicaoContato) {
        this.distribuicaoContato = distribuicaoContato;
   }

   public BigDecimal getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(BigDecimal numEnd) {
        this.numEnd = numEnd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuPlan() {
        return nuPlan;
   }

   public void setNuPlan(BigDecimal nuPlan) {
        this.nuPlan = nuPlan;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        this.codReg = codReg;
   }

   @Override
   public String getEntityName() {
        return "CabecalhoPlanejamentoEntrega";
   }

   @Override
   public CabecalhoPlanejamentoEntrega fromVO(DynamicVO vo) {
        this.codCid = vo.asBigDecimal("CODCID");
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.grupo = vo.asBigDecimal("GRUPO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codParcFat = vo.asBigDecimal("CODPARCFAT");
        this.distribuicaoContato = vo.asBigDecimal("DISTRIBUICAOCONTATO");
        this.numEnd = vo.asBigDecimal("NUMEND");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuPlan = vo.asBigDecimal("NUPLAN");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codReg = vo.asBigDecimal("CODREG");
        return this;
   }
}
