package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguradorBlocoRegistro extends AbstractSankhyaEntity<ConfiguradorBlocoRegistro> {
   public String getArquivosKw() {
        return this.getVo().asString("ARQUIVOSKW");
   }

   public void setArquivosKw(String arquivosKw) {
        markAsChanged("ARQUIVOSKW", arquivosKw);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getBloco() {
        return this.getVo().asString("BLOCO");
   }

   public void setBloco(String bloco) {
        markAsChanged("BLOCO", bloco);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getCmdSql() {
        return this.getVo().asString("CMDSQL");
   }

   public void setCmdSql(String cmdSql) {
        markAsChanged("CMDSQL", cmdSql);
   }

   public BigDecimal getRegistro() {
        return this.getVo().asBigDecimal("REGISTRO");
   }

   public void setRegistro(BigDecimal registro) {
        markAsChanged("REGISTRO", registro);
   }

   public String getCodigo() {
        return this.getVo().asString("CODIGO");
   }

   public void setCodigo(String codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public String getPermVlrZerado() {
        return this.getVo().asString("PERMVLRZERADO");
   }

   public void setPermVlrZerado(String permVlrZerado) {
        markAsChanged("PERMVLRZERADO", permVlrZerado);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   @Override
   public String getTableName() {
        return "TCBECF";
   }

   @Override
   public String getEntityName() {
        return "ConfiguradorBlocoRegistro";
   }

   @Override
   public ConfiguradorBlocoRegistro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
