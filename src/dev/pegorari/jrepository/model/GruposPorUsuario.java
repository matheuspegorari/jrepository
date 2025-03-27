package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GruposPorUsuario extends AbstractSankhyaEntity<GruposPorUsuario> {
   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDataFim() {
        return this.getVo().asTimestamp("DATAFIM");
   }

   public void setDataFim(Timestamp dataFim) {
        markAsChanged("DATAFIM", dataFim);
   }

   public Timestamp getDataInicio() {
        return this.getVo().asTimestamp("DATAINICIO");
   }

   public void setDataInicio(Timestamp dataInicio) {
        markAsChanged("DATAINICIO", dataInicio);
   }

   public String getRepassar() {
        return this.getVo().asString("REPASSAR");
   }

   public void setRepassar(String repassar) {
        markAsChanged("REPASSAR", repassar);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TSIGPU";
   }

   @Override
   public String getEntityName() {
        return "GruposPorUsuario";
   }

   @Override
   public GruposPorUsuario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
