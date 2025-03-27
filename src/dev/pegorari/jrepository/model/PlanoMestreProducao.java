package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoMestreProducao extends AbstractSankhyaEntity<PlanoMestreProducao> {
   public Timestamp getDtIniPed() {
        return this.getVo().asTimestamp("DTINIPED");
   }

   public void setDtIniPed(Timestamp dtIniPed) {
        markAsChanged("DTINIPED", dtIniPed);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public Timestamp getDtFinPed() {
        return this.getVo().asTimestamp("DTFINPED");
   }

   public void setDtFinPed(Timestamp dtFinPed) {
        markAsChanged("DTFINPED", dtFinPed);
   }

   public Timestamp getDtIniCmps() {
        return this.getVo().asTimestamp("DTINICMPS");
   }

   public void setDtIniCmps(Timestamp dtIniCmps) {
        markAsChanged("DTINICMPS", dtIniCmps);
   }

   public Timestamp getDtFinMps() {
        return this.getVo().asTimestamp("DTFINMPS");
   }

   public void setDtFinMps(Timestamp dtFinMps) {
        markAsChanged("DTFINMPS", dtFinMps);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhGerMrp() {
        return this.getVo().asTimestamp("DHGERMRP");
   }

   public void setDhGerMrp(Timestamp dhGerMrp) {
        markAsChanged("DHGERMRP", dhGerMrp);
   }

   public BigDecimal getNuMps() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNuMps(BigDecimal nuMps) {
        markAsChanged("NUMPS", nuMps);
   }

   public BigDecimal getCodPlanta() {
        return this.getVo().asBigDecimal("CODPLANTA");
   }

   public void setCodPlanta(BigDecimal codPlanta) {
        markAsChanged("CODPLANTA", codPlanta);
   }

   public BigDecimal getCodCmps() {
        return this.getVo().asBigDecimal("CODCMPS");
   }

   public void setCodCmps(BigDecimal codCmps) {
        markAsChanged("CODCMPS", codCmps);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getPercAjusteDem() {
        return this.getVo().asBigDecimal("PERCAJUSTEDEM");
   }

   public void setPercAjusteDem(BigDecimal percAjusteDem) {
        markAsChanged("PERCAJUSTEDEM", percAjusteDem);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getObservacoes() {
        return this.getVo().asString("OBSERVACOES");
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
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
        this.setVo(vo);
        return this;
   }
}
