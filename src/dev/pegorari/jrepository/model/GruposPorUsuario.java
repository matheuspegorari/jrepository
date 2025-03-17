package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GruposPorUsuario implements SankhyaEntity<GruposPorUsuario> {

   private BigDecimal codGrupo;
   private BigDecimal codUsu;
   private Timestamp dataFim;
   private Timestamp dataInicio;
   private String repassar;
   private BigDecimal sequencia;

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDataFim() {
        return dataFim;
   }

   public void setDataFim(Timestamp dataFim) {
        this.dataFim = dataFim;
   }

   public Timestamp getDataInicio() {
        return dataInicio;
   }

   public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
   }

   public String getRepassar() {
        return repassar;
   }

   public void setRepassar(String repassar) {
        this.repassar = repassar;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "GruposPorUsuario";
   }

   @Override
   public GruposPorUsuario fromVO(DynamicVO vo) {
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dataFim = vo.asTimestamp("DATAFIM");
        this.dataInicio = vo.asTimestamp("DATAINICIO");
        this.repassar = vo.asString("REPASSAR");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
