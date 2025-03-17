package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabDinamicaPlanoContaRef extends AbstractSankhyaEntity<TabDinamicaPlanoContaRef> {
   private BigDecimal tipo;
   private String tabela;
   private BigDecimal ano;
   private BigDecimal codUsu;
   private String versao;
   private Timestamp dtAlter;

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        this.tabela = tabela;
   }

   public BigDecimal getAno() {
        return ano;
   }

   public void setAno(BigDecimal ano) {
        this.ano = ano;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getVersao() {
        return versao;
   }

   public void setVersao(String versao) {
        this.versao = versao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   @Override
   public String getTableName() {
        return "TCBDPLR";
   }

   @Override
   public String getEntityName() {
        return "TabDinamicaPlanoContaRef";
   }

   @Override
   public TabDinamicaPlanoContaRef fromVO(DynamicVO vo) {
        this.tipo = vo.asBigDecimal("TIPO");
        this.tabela = vo.asString("TABELA");
        this.ano = vo.asBigDecimal("ANO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.versao = vo.asString("VERSAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        return this;
   }
}
