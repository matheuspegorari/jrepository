package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoPlanejamentoEntrega extends AbstractSankhyaEntity<CabecalhoPlanejamentoEntrega> {
   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodBai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getGrupo() {
        return this.getVo().asBigDecimal("GRUPO");
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodParcFat() {
        return this.getVo().asBigDecimal("CODPARCFAT");
   }

   public void setCodParcFat(BigDecimal codParcFat) {
        markAsChanged("CODPARCFAT", codParcFat);
   }

   public BigDecimal getDistribuicaoContato() {
        return this.getVo().asBigDecimal("DISTRIBUICAOCONTATO");
   }

   public void setDistribuicaoContato(BigDecimal distribuicaoContato) {
        markAsChanged("DISTRIBUICAOCONTATO", distribuicaoContato);
   }

   public BigDecimal getNumEnd() {
        return this.getVo().asBigDecimal("NUMEND");
   }

   public void setNumEnd(BigDecimal numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuPlan() {
        return this.getVo().asBigDecimal("NUPLAN");
   }

   public void setNuPlan(BigDecimal nuPlan) {
        markAsChanged("NUPLAN", nuPlan);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   @Override
   public String getTableName() {
        return "TGFPLAC";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoPlanejamentoEntrega";
   }

   @Override
   public CabecalhoPlanejamentoEntrega fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
