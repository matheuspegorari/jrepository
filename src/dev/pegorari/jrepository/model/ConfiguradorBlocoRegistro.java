package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguradorBlocoRegistro extends AbstractSankhyaEntity<ConfiguradorBlocoRegistro> {
   private String arquivosKw;
   private BigDecimal codEmp;
   private String bloco;
   private String tipo;
   private String cmdSql;
   private BigDecimal registro;
   private String codigo;
   private String permVlrZerado;
   private String ativo;
   private BigDecimal valor;
   private BigDecimal codUsu;
   private String tabela;
   private Timestamp dtAlter;

   public String getArquivosKw() {
        return arquivosKw;
   }

   public void setArquivosKw(String arquivosKw) {
        markAsChanged("ARQUIVOSKW", arquivosKw);
        this.arquivosKw = arquivosKw;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getBloco() {
        return bloco;
   }

   public void setBloco(String bloco) {
        markAsChanged("BLOCO", bloco);
        this.bloco = bloco;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getCmdSql() {
        return cmdSql;
   }

   public void setCmdSql(String cmdSql) {
        markAsChanged("CMDSQL", cmdSql);
        this.cmdSql = cmdSql;
   }

   public BigDecimal getRegistro() {
        return registro;
   }

   public void setRegistro(BigDecimal registro) {
        markAsChanged("REGISTRO", registro);
        this.registro = registro;
   }

   public String getCodigo() {
        return codigo;
   }

   public void setCodigo(String codigo) {
        markAsChanged("CODIGO", codigo);
        this.codigo = codigo;
   }

   public String getPermVlrZerado() {
        return permVlrZerado;
   }

   public void setPermVlrZerado(String permVlrZerado) {
        markAsChanged("PERMVLRZERADO", permVlrZerado);
        this.permVlrZerado = permVlrZerado;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
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
        this.setOriginalVO(vo);
        this.arquivosKw = vo.asString("ARQUIVOSKW");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.bloco = vo.asString("BLOCO");
        this.tipo = vo.asString("TIPO");
        this.cmdSql = vo.asString("CMDSQL");
        this.registro = vo.asBigDecimal("REGISTRO");
        this.codigo = vo.asString("CODIGO");
        this.permVlrZerado = vo.asString("PERMVLRZERADO");
        this.ativo = vo.asString("ATIVO");
        this.valor = vo.asBigDecimal("VALOR");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.tabela = vo.asString("TABELA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        return this;
   }
}
