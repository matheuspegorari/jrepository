package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoMestreProducao extends AbstractSankhyaEntity<PlanoMestreProducao> {
   private Timestamp dtIniPed;
   private String situacao;
   private Timestamp dtFinPed;
   private Timestamp dtIniCmps;
   private Timestamp dtFinMps;
   private Timestamp dhAlter;
   private Timestamp dhGerMrp;
   private BigDecimal nuMps;
   private BigDecimal codPlanta;
   private BigDecimal codCmps;
   private BigDecimal codUsu;
   private BigDecimal percAjusteDem;
   private String descricao;
   private String observacoes;

   public Timestamp getDtIniPed() {
        return dtIniPed;
   }

   public void setDtIniPed(Timestamp dtIniPed) {
        this.dtIniPed = dtIniPed;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public Timestamp getDtFinPed() {
        return dtFinPed;
   }

   public void setDtFinPed(Timestamp dtFinPed) {
        this.dtFinPed = dtFinPed;
   }

   public Timestamp getDtIniCmps() {
        return dtIniCmps;
   }

   public void setDtIniCmps(Timestamp dtIniCmps) {
        this.dtIniCmps = dtIniCmps;
   }

   public Timestamp getDtFinMps() {
        return dtFinMps;
   }

   public void setDtFinMps(Timestamp dtFinMps) {
        this.dtFinMps = dtFinMps;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhGerMrp() {
        return dhGerMrp;
   }

   public void setDhGerMrp(Timestamp dhGerMrp) {
        this.dhGerMrp = dhGerMrp;
   }

   public BigDecimal getNuMps() {
        return nuMps;
   }

   public void setNuMps(BigDecimal nuMps) {
        this.nuMps = nuMps;
   }

   public BigDecimal getCodPlanta() {
        return codPlanta;
   }

   public void setCodPlanta(BigDecimal codPlanta) {
        this.codPlanta = codPlanta;
   }

   public BigDecimal getCodCmps() {
        return codCmps;
   }

   public void setCodCmps(BigDecimal codCmps) {
        this.codCmps = codCmps;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getPercAjusteDem() {
        return percAjusteDem;
   }

   public void setPercAjusteDem(BigDecimal percAjusteDem) {
        this.percAjusteDem = percAjusteDem;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getObservacoes() {
        return observacoes;
   }

   public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
   }

   @Override
   public String getTableName() {
        return "TPRMPS";
   }

   @Override
   public String getEntityName() {
        return "PlanoMestreProducao";
   }

   @Override
   public PlanoMestreProducao fromVO(DynamicVO vo) {
        this.dtIniPed = vo.asTimestamp("DTINIPED");
        this.situacao = vo.asString("SITUACAO");
        this.dtFinPed = vo.asTimestamp("DTFINPED");
        this.dtIniCmps = vo.asTimestamp("DTINICMPS");
        this.dtFinMps = vo.asTimestamp("DTFINMPS");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhGerMrp = vo.asTimestamp("DHGERMRP");
        this.nuMps = vo.asBigDecimal("NUMPS");
        this.codPlanta = vo.asBigDecimal("CODPLANTA");
        this.codCmps = vo.asBigDecimal("CODCMPS");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.percAjusteDem = vo.asBigDecimal("PERCAJUSTEDEM");
        this.descricao = vo.asString("DESCRICAO");
        this.observacoes = vo.asString("OBSERVACOES");
        return this;
   }
}
