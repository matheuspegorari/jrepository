package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConsolidacaoAcessos extends AbstractSankhyaEntity<ConsolidacaoAcessos> {
   private BigDecimal codUsu;
   private BigDecimal codGrupo;
   private String consultar;
   private BigDecimal codConfig;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public String getConsultar() {
        return consultar;
   }

   public void setConsultar(String consultar) {
        markAsChanged("CONSULTAR", consultar);
        this.consultar = consultar;
   }

   public BigDecimal getCodConfig() {
        return codConfig;
   }

   public void setCodConfig(BigDecimal codConfig) {
        markAsChanged("CODCONFIG", codConfig);
        this.codConfig = codConfig;
   }

   @Override
   public String getTableName() {
        return "TGFUCM";
   }

   @Override
   public String getEntityName() {
        return "ConsolidacaoAcessos";
   }

   @Override
   public ConsolidacaoAcessos fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.consultar = vo.asString("CONSULTAR");
        this.codConfig = vo.asBigDecimal("CODCONFIG");
        return this;
   }
}
