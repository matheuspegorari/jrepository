package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguradorBlocoRegistro implements SankhyaEntity<ConfiguradorBlocoRegistro> {

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
        this.arquivosKw = arquivosKw;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getBloco() {
        return bloco;
   }

   public void setBloco(String bloco) {
        this.bloco = bloco;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getCmdSql() {
        return cmdSql;
   }

   public void setCmdSql(String cmdSql) {
        this.cmdSql = cmdSql;
   }

   public BigDecimal getRegistro() {
        return registro;
   }

   public void setRegistro(BigDecimal registro) {
        this.registro = registro;
   }

   public String getCodigo() {
        return codigo;
   }

   public void setCodigo(String codigo) {
        this.codigo = codigo;
   }

   public String getPermVlrZerado() {
        return permVlrZerado;
   }

   public void setPermVlrZerado(String permVlrZerado) {
        this.permVlrZerado = permVlrZerado;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        this.tabela = tabela;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   @Override
   public String getEntityName() {
        return "ConfiguradorBlocoRegistro";
   }

   @Override
   public ConfiguradorBlocoRegistro fromVO(DynamicVO vo) {
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
