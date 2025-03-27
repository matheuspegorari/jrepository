package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ArqRelatoriosPersonalizados extends AbstractSankhyaEntity<ArqRelatoriosPersonalizados> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTabela() {
        return this.getVo().asBigDecimal("TABELA");
   }

   public void setTabela(BigDecimal tabela) {
        markAsChanged("TABELA", tabela);
   }

   public String getArqPersonalizado() {
        return this.getVo().asString("ARQPERSONALIZADO");
   }

   public void setArqPersonalizado(String arqPersonalizado) {
        markAsChanged("ARQPERSONALIZADO", arqPersonalizado);
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

   public String getIdPasta() {
        return this.getVo().asString("IDPASTA");
   }

   public void setIdPasta(String idPasta) {
        markAsChanged("IDPASTA", idPasta);
   }

   public BigDecimal getNuPeriodoCtb() {
        return this.getVo().asBigDecimal("NUPERIODOCTB");
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        markAsChanged("NUPERIODOCTB", nuPeriodoCtb);
   }

   @Override
   public String getTableName() {
        return "TCBARP";
   }

   @Override
   public String getEntityName() {
        return "ArqRelatoriosPersonalizados";
   }

   @Override
   public ArqRelatoriosPersonalizados fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
