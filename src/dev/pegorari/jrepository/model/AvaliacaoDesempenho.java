package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AvaliacaoDesempenho extends AbstractSankhyaEntity<AvaliacaoDesempenho> {
   public BigDecimal getNuPla() {
        return this.getVo().asBigDecimal("NUPLA");
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
   }

   public BigDecimal getNuAvaliacao() {
        return this.getVo().asBigDecimal("NUAVALIACAO");
   }

   public void setNuAvaliacao(BigDecimal nuAvaliacao) {
        markAsChanged("NUAVALIACAO", nuAvaliacao);
   }

   public BigDecimal getNuPlaAvaliado() {
        return this.getVo().asBigDecimal("NUPLAAVALIADO");
   }

   public void setNuPlaAvaliado(BigDecimal nuPlaAvaliado) {
        markAsChanged("NUPLAAVALIADO", nuPlaAvaliado);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   @Override
   public String getTableName() {
        return "TPQAVD";
   }

   @Override
   public String getEntityName() {
        return "AvaliacaoDesempenho";
   }

   @Override
   public AvaliacaoDesempenho fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
