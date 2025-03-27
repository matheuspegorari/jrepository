package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Funcionario extends AbstractSankhyaEntity<Funcionario> {
   public BigDecimal getDependConvMed() {
        return this.getVo().asBigDecimal("DEPENDCONVMED");
   }

   public void setDependConvMed(BigDecimal dependConvMed) {
        markAsChanged("DEPENDCONVMED", dependConvMed);
   }

   public BigDecimal getDependIrf() {
        return this.getVo().asBigDecimal("DEPENDIRF");
   }

   public void setDependIrf(BigDecimal dependIrf) {
        markAsChanged("DEPENDIRF", dependIrf);
   }

   public BigDecimal getDependSalFam() {
        return this.getVo().asBigDecimal("DEPENDSALFAM");
   }

   public void setDependSalFam(BigDecimal dependSalFam) {
        markAsChanged("DEPENDSALFAM", dependSalFam);
   }

   public BigDecimal getDiaApuraPonto() {
        return this.getVo().asBigDecimal("DIAAPURAPONTO");
   }

   public void setDiaApuraPonto(BigDecimal diaApuraPonto) {
        markAsChanged("DIAAPURAPONTO", diaApuraPonto);
   }

   public BigDecimal getDiaCadPis() {
        return this.getVo().asBigDecimal("DIACADPIS");
   }

   public void setDiaCadPis(BigDecimal diaCadPis) {
        markAsChanged("DIACADPIS", diaCadPis);
   }

   public BigDecimal getDiasFerias() {
        return this.getVo().asBigDecimal("DIASFERIAS");
   }

   public void setDiasFerias(BigDecimal diasFerias) {
        markAsChanged("DIASFERIAS", diasFerias);
   }

   public String getAjudaComp() {
        return this.getVo().asString("AJUDACOMP");
   }

   public void setAjudaComp(String ajudaComp) {
        markAsChanged("AJUDACOMP", ajudaComp);
   }

   public String getAprendContrInd() {
        return this.getVo().asString("APRENDCONTRIND");
   }

   public void setAprendContrInd(String aprendContrInd) {
        markAsChanged("APRENDCONTRIND", aprendContrInd);
   }

   public String getBloqueiaBatidaOnline() {
        return this.getVo().asString("BLOQUEIABATIDAONLINE");
   }

   public void setBloqueiaBatidaOnline(String bloqueiaBatidaOnline) {
        markAsChanged("BLOQUEIABATIDAONLINE", bloqueiaBatidaOnline);
   }

   public BigDecimal getCodMadDem() {
        return this.getVo().asBigDecimal("CODMADDEM");
   }

   public void setCodMadDem(BigDecimal codMadDem) {
        markAsChanged("CODMADDEM", codMadDem);
   }

   public Timestamp getDtFimContrInt() {
        return this.getVo().asTimestamp("DTFIMCONTRINT");
   }

   public void setDtFimContrInt(Timestamp dtFimContrInt) {
        markAsChanged("DTFIMCONTRINT", dtFimContrInt);
   }

   public Timestamp getDtFimRed() {
        return this.getVo().asTimestamp("DTFIMRED");
   }

   public void setDtFimRed(Timestamp dtFimRed) {
        markAsChanged("DTFIMRED", dtFimRed);
   }

   public Timestamp getDtInicioRed() {
        return this.getVo().asTimestamp("DTINICIORED");
   }

   public void setDtInicioRed(Timestamp dtInicioRed) {
        markAsChanged("DTINICIORED", dtInicioRed);
   }

   public BigDecimal getHorasSemCpu() {
        return this.getVo().asBigDecimal("HORASSEMCPU");
   }

   public void setHorasSemCpu(BigDecimal horasSemCpu) {
        markAsChanged("HORASSEMCPU", horasSemCpu);
   }

   public BigDecimal getHorasSemRed() {
        return this.getVo().asBigDecimal("HORASSEMRED");
   }

   public void setHorasSemRed(BigDecimal horasSemRed) {
        markAsChanged("HORASSEMRED", horasSemRed);
   }

   public BigDecimal getDiasPeriodo1() {
        return this.getVo().asBigDecimal("DIASPERIODO1");
   }

   public void setDiasPeriodo1(BigDecimal diasPeriodo1) {
        markAsChanged("DIASPERIODO1", diasPeriodo1);
   }

   public BigDecimal getDiasPeriodo2() {
        return this.getVo().asBigDecimal("DIASPERIODO2");
   }

   public void setDiasPeriodo2(BigDecimal diasPeriodo2) {
        markAsChanged("DIASPERIODO2", diasPeriodo2);
   }

   public String getDirReciproco() {
        return this.getVo().asString("DIRRECIPROCO");
   }

   public void setDirReciproco(String dirReciproco) {
        markAsChanged("DIRRECIPROCO", dirReciproco);
   }

   public Timestamp getDtAdm() {
        return this.getVo().asTimestamp("DTADM");
   }

   public void setDtAdm(Timestamp dtAdm) {
        markAsChanged("DTADM", dtAdm);
   }

   public Timestamp getDtAfastamento() {
        return this.getVo().asTimestamp("DTAFASTAMENTO");
   }

   public void setDtAfastamento(Timestamp dtAfastamento) {
        markAsChanged("DTAFASTAMENTO", dtAfastamento);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodSind() {
        return this.getVo().asBigDecimal("CODSIND");
   }

   public void setCodSind(BigDecimal codSind) {
        markAsChanged("CODSIND", codSind);
   }

   public BigDecimal getCodTomador() {
        return this.getVo().asBigDecimal("CODTOMADOR");
   }

   public void setCodTomador(BigDecimal codTomador) {
        markAsChanged("CODTOMADOR", codTomador);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public String getConvMed() {
        return this.getVo().asString("CONVMED");
   }

   public void setConvMed(String convMed) {
        markAsChanged("CONVMED", convMed);
   }

   public String getCpf() {
        return this.getVo().asString("CPF");
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
   }

   public String getCtaFgts() {
        return this.getVo().asString("CTAFGTS");
   }

   public void setCtaFgts(String ctaFgts) {
        markAsChanged("CTAFGTS", ctaFgts);
   }

   public String getDeficienteFisico() {
        return this.getVo().asString("DEFICIENTEFISICO");
   }

   public void setDeficienteFisico(String deficienteFisico) {
        markAsChanged("DEFICIENTEFISICO", deficienteFisico);
   }

   public String getAfastFgts() {
        return this.getVo().asString("AFASTFGTS");
   }

   public void setAfastFgts(String afastFgts) {
        markAsChanged("AFASTFGTS", afastFgts);
   }

   public BigDecimal getAfastRais() {
        return this.getVo().asBigDecimal("AFASTRAIS");
   }

   public void setAfastRais(BigDecimal afastRais) {
        markAsChanged("AFASTRAIS", afastRais);
   }

   public BigDecimal getAnoChegPais() {
        return this.getVo().asBigDecimal("ANOCHEGPAIS");
   }

   public void setAnoChegPais(BigDecimal anoChegPais) {
        markAsChanged("ANOCHEGPAIS", anoChegPais);
   }

   public String getCategoriaCnh() {
        return this.getVo().asString("CATEGORIACNH");
   }

   public void setCategoriaCnh(String categoriaCnh) {
        markAsChanged("CATEGORIACNH", categoriaCnh);
   }

   public BigDecimal getCausaAfast() {
        return this.getVo().asBigDecimal("CAUSAAFAST");
   }

   public void setCausaAfast(BigDecimal causaAfast) {
        markAsChanged("CAUSAAFAST", causaAfast);
   }

   public String getCelular() {
        return this.getVo().asString("CELULAR");
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public BigDecimal getCidNasc() {
        return this.getVo().asBigDecimal("CIDNASC");
   }

   public void setCidNasc(BigDecimal cidNasc) {
        markAsChanged("CIDNASC", cidNasc);
   }

   public String getCodAdmFgts() {
        return this.getVo().asString("CODADMFGTS");
   }

   public void setCodAdmFgts(String codAdmFgts) {
        markAsChanged("CODADMFGTS", codAdmFgts);
   }

   public String getCodAdmFgtsIi() {
        return this.getVo().asString("CODADMFGTSII");
   }

   public void setCodAdmFgtsIi(String codAdmFgtsIi) {
        markAsChanged("CODADMFGTSII", codAdmFgtsIi);
   }

   public String getCodAge() {
        return this.getVo().asString("CODAGE");
   }

   public void setCodAge(String codAge) {
        markAsChanged("CODAGE", codAge);
   }

   public BigDecimal getCodBai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getCodCateg() {
        return this.getVo().asBigDecimal("CODCATEG");
   }

   public void setCodCateg(BigDecimal codCateg) {
        markAsChanged("CODCATEG", codCateg);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodCidTrab() {
        return this.getVo().asBigDecimal("CODCIDTRAB");
   }

   public void setCodCidTrab(BigDecimal codCidTrab) {
        markAsChanged("CODCIDTRAB", codCidTrab);
   }

   public String getCodCtBco() {
        return this.getVo().asString("CODCTABCO");
   }

   public void setCodCtBco(String codCtBco) {
        markAsChanged("CODCTABCO", codCtBco);
   }

   public BigDecimal getCodDep() {
        return this.getVo().asBigDecimal("CODDEP");
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpOrig() {
        return this.getVo().asBigDecimal("CODEMPORIG");
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodFuncao() {
        return this.getVo().asBigDecimal("CODFUNCAO");
   }

   public void setCodFuncao(BigDecimal codFuncao) {
        markAsChanged("CODFUNCAO", codFuncao);
   }

   public BigDecimal getCodFuncOrig() {
        return this.getVo().asBigDecimal("CODFUNCORIG");
   }

   public void setCodFuncOrig(BigDecimal codFuncOrig) {
        markAsChanged("CODFUNCORIG", codFuncOrig);
   }

   public Timestamp getDtAvisoPrevio() {
        return this.getVo().asTimestamp("DTAVISOPREVIO");
   }

   public void setDtAvisoPrevio(Timestamp dtAvisoPrevio) {
        markAsChanged("DTAVISOPREVIO", dtAvisoPrevio);
   }

   public Timestamp getDtCadPis() {
        return this.getVo().asTimestamp("DTCADPIS");
   }

   public void setDtCadPis(Timestamp dtCadPis) {
        markAsChanged("DTCADPIS", dtCadPis);
   }

   public Timestamp getDtCarteiraSaude() {
        return this.getVo().asTimestamp("DTCARTEIRASAUDE");
   }

   public void setDtCarteiraSaude(Timestamp dtCarteiraSaude) {
        markAsChanged("DTCARTEIRASAUDE", dtCarteiraSaude);
   }

   public Timestamp getDtCps() {
        return this.getVo().asTimestamp("DTCPS");
   }

   public void setDtCps(Timestamp dtCps) {
        markAsChanged("DTCPS", dtCps);
   }

   public Timestamp getDtDem() {
        return this.getVo().asTimestamp("DTDEM");
   }

   public void setDtDem(Timestamp dtDem) {
        markAsChanged("DTDEM", dtDem);
   }

   public Timestamp getDtNasc() {
        return this.getVo().asTimestamp("DTNASC");
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
   }

   public Timestamp getDtOptFgts() {
        return this.getVo().asTimestamp("DTOPTFGTS");
   }

   public void setDtOptFgts(Timestamp dtOptFgts) {
        markAsChanged("DTOPTFGTS", dtOptFgts);
   }

   public Timestamp getDtRg() {
        return this.getVo().asTimestamp("DTRG");
   }

   public void setDtRg(Timestamp dtRg) {
        markAsChanged("DTRG", dtRg);
   }

   public Timestamp getDtTransferencia() {
        return this.getVo().asTimestamp("DTTRANSFERENCIA");
   }

   public void setDtTransferencia(Timestamp dtTransferencia) {
        markAsChanged("DTTRANSFERENCIA", dtTransferencia);
   }

   public Timestamp getDtValPais() {
        return this.getVo().asTimestamp("DTVALPAIS");
   }

   public void setDtValPais(Timestamp dtValPais) {
        markAsChanged("DTVALPAIS", dtValPais);
   }

   public Timestamp getDtVencExp1() {
        return this.getVo().asTimestamp("DTVENCEXP1");
   }

   public void setDtVencExp1(Timestamp dtVencExp1) {
        markAsChanged("DTVENCEXP1", dtVencExp1);
   }

   public Timestamp getDtVencExp2() {
        return this.getVo().asTimestamp("DTVENCEXP2");
   }

   public void setDtVencExp2(Timestamp dtVencExp2) {
        markAsChanged("DTVENCEXP2", dtVencExp2);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public BigDecimal getEstadoCivil() {
        return this.getVo().asBigDecimal("ESTADOCIVIL");
   }

   public void setEstadoCivil(BigDecimal estadoCivil) {
        markAsChanged("ESTADOCIVIL", estadoCivil);
   }

   public BigDecimal getHorasSem() {
        return this.getVo().asBigDecimal("HORASSEM");
   }

   public void setHorasSem(BigDecimal horasSem) {
        markAsChanged("HORASSEM", horasSem);
   }

   public String getIdentidade() {
        return this.getVo().asString("IDENTIDADE");
   }

   public void setIdentidade(String identidade) {
        markAsChanged("IDENTIDADE", identidade);
   }

   public byte[] getImagem() {
        return this.getVo().asBlob("IMAGEM");
   }

   public void setImagem(byte[] imagem) {
        markAsChanged("IMAGEM", imagem);
   }

   public BigDecimal getMatricula() {
        return this.getVo().asBigDecimal("MATRICULA");
   }

   public void setMatricula(BigDecimal matricula) {
        markAsChanged("MATRICULA", matricula);
   }

   public BigDecimal getMesDia() {
        return this.getVo().asBigDecimal("MESDIA");
   }

   public void setMesDia(BigDecimal mesDia) {
        markAsChanged("MESDIA", mesDia);
   }

   public BigDecimal getNacionalidade() {
        return this.getVo().asBigDecimal("NACIONALIDADE");
   }

   public void setNacionalidade(BigDecimal nacionalidade) {
        markAsChanged("NACIONALIDADE", nacionalidade);
   }

   public BigDecimal getNacionalPais() {
        return this.getVo().asBigDecimal("NACIONALPAIS");
   }

   public void setNacionalPais(BigDecimal nacionalPais) {
        markAsChanged("NACIONALPAIS", nacionalPais);
   }

   public BigDecimal getNivEsc() {
        return this.getVo().asBigDecimal("NIVESC");
   }

   public void setNivEsc(BigDecimal nivEsc) {
        markAsChanged("NIVESC", nivEsc);
   }

   public String getNomeFunc() {
        return this.getVo().asString("NOMEFUNC");
   }

   public void setNomeFunc(String nomeFunc) {
        markAsChanged("NOMEFUNC", nomeFunc);
   }

   public String getNomeMae() {
        return this.getVo().asString("NOMEMAE");
   }

   public void setNomeMae(String nomeMae) {
        markAsChanged("NOMEMAE", nomeMae);
   }

   public String getNomePai() {
        return this.getVo().asString("NOMEPAI");
   }

   public void setNomePai(String nomePai) {
        markAsChanged("NOMEPAI", nomePai);
   }

   public String getNroCnh() {
        return this.getVo().asString("NROCNH");
   }

   public void setNroCnh(String nroCnh) {
        markAsChanged("NROCNH", nroCnh);
   }

   public String getNroReservista() {
        return this.getVo().asString("NRORESERVISTA");
   }

   public void setNroReservista(String nroReservista) {
        markAsChanged("NRORESERVISTA", nroReservista);
   }

   public BigDecimal getNumCartaoPonto() {
        return this.getVo().asBigDecimal("NUMCARTAOPONTO");
   }

   public void setNumCartaoPonto(BigDecimal numCartaoPonto) {
        markAsChanged("NUMCARTAOPONTO", numCartaoPonto);
   }

   public BigDecimal getNumCps() {
        return this.getVo().asBigDecimal("NUMCPS");
   }

   public void setNumCps(BigDecimal numCps) {
        markAsChanged("NUMCPS", numCps);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public String getOrgaoRg() {
        return this.getVo().asString("ORGAORG");
   }

   public void setOrgaoRg(String orgaoRg) {
        markAsChanged("ORGAORG", orgaoRg);
   }

   public String getPartPat() {
        return this.getVo().asString("PARTPAT");
   }

   public void setPartPat(String partPat) {
        markAsChanged("PARTPAT", partPat);
   }

   public BigDecimal getPercAdiantamento() {
        return this.getVo().asBigDecimal("PERCADIANTAMENTO");
   }

   public void setPercAdiantamento(BigDecimal percAdiantamento) {
        markAsChanged("PERCADIANTAMENTO", percAdiantamento);
   }

   public BigDecimal getPercConv() {
        return this.getVo().asBigDecimal("PERCCONV");
   }

   public void setPercConv(BigDecimal percConv) {
        markAsChanged("PERCCONV", percConv);
   }

   public String getPis() {
        return this.getVo().asString("PIS");
   }

   public void setPis(String pis) {
        markAsChanged("PIS", pis);
   }

   public Timestamp getPrimeiraCnh() {
        return this.getVo().asTimestamp("PRIMEIRACNH");
   }

   public void setPrimeiraCnh(Timestamp primeiraCnh) {
        markAsChanged("PRIMEIRACNH", primeiraCnh);
   }

   public String getPrimEmprego() {
        return this.getVo().asString("PRIMEMPREGO");
   }

   public void setPrimEmprego(String primEmprego) {
        markAsChanged("PRIMEMPREGO", primEmprego);
   }

   public BigDecimal getRacaFuncionario() {
        return this.getVo().asBigDecimal("RACAFUNCIONARIO");
   }

   public void setRacaFuncionario(BigDecimal racaFuncionario) {
        markAsChanged("RACAFUNCIONARIO", racaFuncionario);
   }

   public BigDecimal getRegime() {
        return this.getVo().asBigDecimal("REGIME");
   }

   public void setRegime(BigDecimal regime) {
        markAsChanged("REGIME", regime);
   }

   public BigDecimal getRemuMinima() {
        return this.getVo().asBigDecimal("REMUMINIMA");
   }

   public void setRemuMinima(BigDecimal remuMinima) {
        markAsChanged("REMUMINIMA", remuMinima);
   }

   public String getRne() {
        return this.getVo().asString("RNE");
   }

   public void setRne(String rne) {
        markAsChanged("RNE", rne);
   }

   public BigDecimal getSalBase() {
        return this.getVo().asBigDecimal("SALBASE");
   }

   public void setSalBase(BigDecimal salBase) {
        markAsChanged("SALBASE", salBase);
   }

   public BigDecimal getSecaoEleitoral() {
        return this.getVo().asBigDecimal("SECAOELEITORAL");
   }

   public void setSecaoEleitoral(BigDecimal secaoEleitoral) {
        markAsChanged("SECAOELEITORAL", secaoEleitoral);
   }

   public String getSenha() {
        return this.getVo().asString("SENHA");
   }

   public void setSenha(String senha) {
        markAsChanged("SENHA", senha);
   }

   public String getSerieCps() {
        return this.getVo().asString("SERIECPS");
   }

   public void setSerieCps(String serieCps) {
        markAsChanged("SERIECPS", serieCps);
   }

   public String getSexo() {
        return this.getVo().asString("SEXO");
   }

   public void setSexo(String sexo) {
        markAsChanged("SEXO", sexo);
   }

   public String getSindicalizado() {
        return this.getVo().asString("SINDICALIZADO");
   }

   public void setSindicalizado(String sindicalizado) {
        markAsChanged("SINDICALIZADO", sindicalizado);
   }

   public String getSitPais() {
        return this.getVo().asString("SITPAIS");
   }

   public void setSitPais(String sitPais) {
        markAsChanged("SITPAIS", sitPais);
   }

   public String getSitSind() {
        return this.getVo().asString("SITSIND");
   }

   public void setSitSind(String sitSind) {
        markAsChanged("SITSIND", sitSind);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public String getTipConta() {
        return this.getVo().asString("TIPCONTA");
   }

   public void setTipConta(String tipConta) {
        markAsChanged("TIPCONTA", tipConta);
   }

   public BigDecimal getTipDeficiencia() {
        return this.getVo().asBigDecimal("TIPDEFICIENCIA");
   }

   public void setTipDeficiencia(BigDecimal tipDeficiencia) {
        markAsChanged("TIPDEFICIENCIA", tipDeficiencia);
   }

   public String getTipPonto() {
        return this.getVo().asString("TIPPONTO");
   }

   public void setTipPonto(String tipPonto) {
        markAsChanged("TIPPONTO", tipPonto);
   }

   public String getTipReceb() {
        return this.getVo().asString("TIPRECEB");
   }

   public void setTipReceb(String tipReceb) {
        markAsChanged("TIPRECEB", tipReceb);
   }

   public String getTipSal() {
        return this.getVo().asString("TIPSAL");
   }

   public void setTipSal(String tipSal) {
        markAsChanged("TIPSAL", tipSal);
   }

   public String getTipTab() {
        return this.getVo().asString("TIPTAB");
   }

   public void setTipTab(String tipTab) {
        markAsChanged("TIPTAB", tipTab);
   }

   public String getTitEleitoral() {
        return this.getVo().asString("TITELEITORAL");
   }

   public void setTitEleitoral(String titEleitoral) {
        markAsChanged("TITELEITORAL", titEleitoral);
   }

   public String getTrabOutraEmp() {
        return this.getVo().asString("TRABOUTRAEMP");
   }

   public void setTrabOutraEmp(String trabOutraEmp) {
        markAsChanged("TRABOUTRAEMP", trabOutraEmp);
   }

   public BigDecimal getUfCps() {
        return this.getVo().asBigDecimal("UFCPS");
   }

   public void setUfCps(BigDecimal ufCps) {
        markAsChanged("UFCPS", ufCps);
   }

   public Timestamp getVencimentoCnh() {
        return this.getVo().asTimestamp("VENCIMENTOCNH");
   }

   public void setVencimentoCnh(Timestamp vencimentoCnh) {
        markAsChanged("VENCIMENTOCNH", vencimentoCnh);
   }

   public BigDecimal getVinculo() {
        return this.getVo().asBigDecimal("VINCULO");
   }

   public void setVinculo(BigDecimal vinculo) {
        markAsChanged("VINCULO", vinculo);
   }

   public BigDecimal getZonaEleitoral() {
        return this.getVo().asBigDecimal("ZONAELEITORAL");
   }

   public void setZonaEleitoral(BigDecimal zonaEleitoral) {
        markAsChanged("ZONAELEITORAL", zonaEleitoral);
   }

   public BigDecimal getCodGrupoCtbz() {
        return this.getVo().asBigDecimal("CODGRUPOCTBZ");
   }

   public void setCodGrupoCtbz(BigDecimal codGrupoCtbz) {
        markAsChanged("CODGRUPOCTBZ", codGrupoCtbz);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodSaq() {
        return this.getVo().asBigDecimal("CODSAQ");
   }

   public void setCodSaq(BigDecimal codSaq) {
        markAsChanged("CODSAQ", codSaq);
   }

   public String getCasadoBr() {
        return this.getVo().asString("CASADOBR");
   }

   public void setCasadoBr(String casadoBr) {
        markAsChanged("CASADOBR", casadoBr);
   }

   public BigDecimal getClasTrabEstrang() {
        return this.getVo().asBigDecimal("CLASSTRABESTRANG");
   }

   public void setClasTrabEstrang(BigDecimal clasTrabEstrang) {
        markAsChanged("CLASSTRABESTRANG", clasTrabEstrang);
   }

   public Timestamp getDtChegPais() {
        return this.getVo().asTimestamp("DTCHEGPAIS");
   }

   public void setDtChegPais(Timestamp dtChegPais) {
        markAsChanged("DTCHEGPAIS", dtChegPais);
   }

   public Timestamp getDtExpRne() {
        return this.getVo().asTimestamp("DTEXPRNE");
   }

   public void setDtExpRne(Timestamp dtExpRne) {
        markAsChanged("DTEXPRNE", dtExpRne);
   }

   public Timestamp getDtNatural() {
        return this.getVo().asTimestamp("DTNATURAL");
   }

   public void setDtNatural(Timestamp dtNatural) {
        markAsChanged("DTNATURAL", dtNatural);
   }

   public String getFilhosBr() {
        return this.getVo().asString("FILHOSBR");
   }

   public void setFilhosBr(String filhosBr) {
        markAsChanged("FILHOSBR", filhosBr);
   }

   public BigDecimal getIndAdmissao() {
        return this.getVo().asBigDecimal("INDADMISSAO");
   }

   public void setIndAdmissao(BigDecimal indAdmissao) {
        markAsChanged("INDADMISSAO", indAdmissao);
   }

   public String getNroNatural() {
        return this.getVo().asString("NRONATURAL");
   }

   public void setNroNatural(String nroNatural) {
        markAsChanged("NRONATURAL", nroNatural);
   }

   public String getObsDeficiencia() {
        return this.getVo().asString("OBSDEFICIENCIA");
   }

   public void setObsDeficiencia(String obsDeficiencia) {
        markAsChanged("OBSDEFICIENCIA", obsDeficiencia);
   }

   public BigDecimal getOptFgts() {
        return this.getVo().asBigDecimal("OPTFGTS");
   }

   public void setOptFgts(BigDecimal optFgts) {
        markAsChanged("OPTFGTS", optFgts);
   }

   public String getOrgaoCnh() {
        return this.getVo().asString("ORGAOCNH");
   }

   public void setOrgaoCnh(String orgaoCnh) {
        markAsChanged("ORGAOCNH", orgaoCnh);
   }

   public String getOrgaoRne() {
        return this.getVo().asString("ORGAORNE");
   }

   public void setOrgaoRne(String orgaoRne) {
        markAsChanged("ORGAORNE", orgaoRne);
   }

   public BigDecimal getRegimeJor() {
        return this.getVo().asBigDecimal("REGIMEJOR");
   }

   public void setRegimeJor(BigDecimal regimeJor) {
        markAsChanged("REGIMEJOR", regimeJor);
   }

   public BigDecimal getRegimeTrab() {
        return this.getVo().asBigDecimal("REGIMETRAB");
   }

   public void setRegimeTrab(BigDecimal regimeTrab) {
        markAsChanged("REGIMETRAB", regimeTrab);
   }

   public BigDecimal getCodCarreira() {
        return this.getVo().asBigDecimal("CODCARREIRA");
   }

   public void setCodCarreira(BigDecimal codCarreira) {
        markAsChanged("CODCARREIRA", codCarreira);
   }

   public BigDecimal getCodCategTrabCedido() {
        return this.getVo().asBigDecimal("CODCATEGTRABCEDIDO");
   }

   public void setCodCategTrabCedido(BigDecimal codCategTrabCedido) {
        markAsChanged("CODCATEGTRABCEDIDO", codCategTrabCedido);
   }

   public BigDecimal getCodCidCertCivil() {
        return this.getVo().asBigDecimal("CODCIDCERTCIVIL");
   }

   public void setCodCidCertCivil(BigDecimal codCidCertCivil) {
        markAsChanged("CODCIDCERTCIVIL", codCidCertCivil);
   }

   public BigDecimal getCodConvenio() {
        return this.getVo().asBigDecimal("CODCONVENIO");
   }

   public void setCodConvenio(BigDecimal codConvenio) {
        markAsChanged("CODCONVENIO", codConvenio);
   }

   public BigDecimal getCodEmpDest() {
        return this.getVo().asBigDecimal("CODEMPDEST");
   }

   public void setCodEmpDest(BigDecimal codEmpDest) {
        markAsChanged("CODEMPDEST", codEmpDest);
   }

   public BigDecimal getCodEmpFuncSubst() {
        return this.getVo().asBigDecimal("CODEMPFUNCSUBST");
   }

   public void setCodEmpFuncSubst(BigDecimal codEmpFuncSubst) {
        markAsChanged("CODEMPFUNCSUBST", codEmpFuncSubst);
   }

   public BigDecimal getCodEmpFuncSup() {
        return this.getVo().asBigDecimal("CODEMPFUNCSUP");
   }

   public void setCodEmpFuncSup(BigDecimal codEmpFuncSup) {
        markAsChanged("CODEMPFUNCSUP", codEmpFuncSup);
   }

   public BigDecimal getCodEmpRespNis() {
        return this.getVo().asBigDecimal("CODEMPRESPNIS");
   }

   public void setCodEmpRespNis(BigDecimal codEmpRespNis) {
        markAsChanged("CODEMPRESPNIS", codEmpRespNis);
   }

   public BigDecimal getCodFuncDest() {
        return this.getVo().asBigDecimal("CODFUNCDEST");
   }

   public void setCodFuncDest(BigDecimal codFuncDest) {
        markAsChanged("CODFUNCDEST", codFuncDest);
   }

   public BigDecimal getCodFuncSubst() {
        return this.getVo().asBigDecimal("CODFUNCSUBST");
   }

   public void setCodFuncSubst(BigDecimal codFuncSubst) {
        markAsChanged("CODFUNCSUBST", codFuncSubst);
   }

   public BigDecimal getCodFuncSup() {
        return this.getVo().asBigDecimal("CODFUNCSUP");
   }

   public void setCodFuncSup(BigDecimal codFuncSup) {
        markAsChanged("CODFUNCSUP", codFuncSup);
   }

   public BigDecimal getCodGrupoHorario() {
        return this.getVo().asBigDecimal("CODGRUPOHORARIO");
   }

   public void setCodGrupoHorario(BigDecimal codGrupoHorario) {
        markAsChanged("CODGRUPOHORARIO", codGrupoHorario);
   }

   public String getCodMotDesligTransf() {
        return this.getVo().asString("CODMOTDESLIGTRANSF");
   }

   public void setCodMotDesligTransf(String codMotDesligTransf) {
        markAsChanged("CODMOTDESLIGTRANSF", codMotDesligTransf);
   }

   public BigDecimal getCodNivel() {
        return this.getVo().asBigDecimal("CODNIVEL");
   }

   public void setCodNivel(BigDecimal codNivel) {
        markAsChanged("CODNIVEL", codNivel);
   }

   public BigDecimal getCodTpr() {
        return this.getVo().asBigDecimal("CODTPR");
   }

   public void setCodTpr(BigDecimal codTpr) {
        markAsChanged("CODTPR", codTpr);
   }

   public String getCompensaSabado() {
        return this.getVo().asString("COMPENSASABADO");
   }

   public void setCompensaSabado(String compensaSabado) {
        markAsChanged("COMPENSASABADO", compensaSabado);
   }

   public BigDecimal getCompSalario() {
        return this.getVo().asBigDecimal("COMPSALARIO");
   }

   public void setCompSalario(BigDecimal compSalario) {
        markAsChanged("COMPSALARIO", compSalario);
   }

   public String getContratoSusp() {
        return this.getVo().asString("CONTRATOSUSP");
   }

   public void setContratoSusp(String contratoSusp) {
        markAsChanged("CONTRATOSUSP", contratoSusp);
   }

   public BigDecimal getContTrabTemp() {
        return this.getVo().asBigDecimal("CONTTRABTEMP");
   }

   public void setContTrabTemp(BigDecimal contTrabTemp) {
        markAsChanged("CONTTRABTEMP", contTrabTemp);
   }

   public String getCpfAnt() {
        return this.getVo().asString("CPFANT");
   }

   public void setCpfAnt(String cpfAnt) {
        markAsChanged("CPFANT", cpfAnt);
   }

   public String getCpfSubstituido() {
        return this.getVo().asString("CPFSUBSTITUIDO");
   }

   public void setCpfSubstituido(String cpfSubstituido) {
        markAsChanged("CPFSUBSTITUIDO", cpfSubstituido);
   }

   public String getCrmMedicoAso() {
        return this.getVo().asString("CRMMEDICOASO");
   }

   public void setCrmMedicoAso(String crmMedicoAso) {
        markAsChanged("CRMMEDICOASO", crmMedicoAso);
   }

   public BigDecimal getDiasAvisoPrevio() {
        return this.getVo().asBigDecimal("DIASAVISOPREVIO");
   }

   public void setDiasAvisoPrevio(BigDecimal diasAvisoPrevio) {
        markAsChanged("DIASAVISOPREVIO", diasAvisoPrevio);
   }

   public BigDecimal getDiaSemGrupoHr() {
        return this.getVo().asBigDecimal("DIASEMGRUPOHR");
   }

   public void setDiaSemGrupoHr(BigDecimal diaSemGrupoHr) {
        markAsChanged("DIASEMGRUPOHR", diaSemGrupoHr);
   }

   public String getDispensaPonto() {
        return this.getVo().asString("DISPENSAPONTO");
   }

   public void setDispensaPonto(String dispensaPonto) {
        markAsChanged("DISPENSAPONTO", dispensaPonto);
   }

   public String getDispPerExp() {
        return this.getVo().asString("DISPPEREXP");
   }

   public void setDispPerExp(String dispPerExp) {
        markAsChanged("DISPPEREXP", dispPerExp);
   }

   public String getDscAtivDes() {
        return this.getVo().asString("DSCATIVDES");
   }

   public void setDscAtivDes(String dscAtivDes) {
        markAsChanged("DSCATIVDES", dscAtivDes);
   }

   public Timestamp getDtAdmEmpCed() {
        return this.getVo().asTimestamp("DTADMEMPCED");
   }

   public void setDtAdmEmpCed(Timestamp dtAdmEmpCed) {
        markAsChanged("DTADMEMPCED", dtAdmEmpCed);
   }

   public Timestamp getDtAltCpf() {
        return this.getVo().asTimestamp("DTALTCPF");
   }

   public void setDtAltCpf(Timestamp dtAltCpf) {
        markAsChanged("DTALTCPF", dtAltCpf);
   }

   public Timestamp getDtAso() {
        return this.getVo().asTimestamp("DTASO");
   }

   public void setDtAso(Timestamp dtAso) {
        markAsChanged("DTASO", dtAso);
   }

   public Timestamp getDtEmiCertCivil() {
        return this.getVo().asTimestamp("DTEMICERTCIVIL");
   }

   public void setDtEmiCertCivil(Timestamp dtEmiCertCivil) {
        markAsChanged("DTEMICERTCIVIL", dtEmiCertCivil);
   }

   public Timestamp getDtEmiPorte() {
        return this.getVo().asTimestamp("DTEMIPPORTE");
   }

   public void setDtEmiPorte(Timestamp dtEmiPorte) {
        markAsChanged("DTEMIPPORTE", dtEmiPorte);
   }

   public Timestamp getDtEsocial2205() {
        return this.getVo().asTimestamp("DTESOCIAL2205");
   }

   public void setDtEsocial2205(Timestamp dtEsocial2205) {
        markAsChanged("DTESOCIAL2205", dtEsocial2205);
   }

   public Timestamp getDtEsocial2206() {
        return this.getVo().asTimestamp("DTESOCIAL2206");
   }

   public void setDtEsocial2206(Timestamp dtEsocial2206) {
        markAsChanged("DTESOCIAL2206", dtEsocial2206);
   }

   public Timestamp getDtExpOc() {
        return this.getVo().asTimestamp("DTEXPOC");
   }

   public void setDtExpOc(Timestamp dtExpOc) {
        markAsChanged("DTEXPOC", dtExpOc);
   }

   public Timestamp getDtFimQuarentena() {
        return this.getVo().asTimestamp("DTFIMQUARENTENA");
   }

   public void setDtFimQuarentena(Timestamp dtFimQuarentena) {
        markAsChanged("DTFIMQUARENTENA", dtFimQuarentena);
   }

   public Timestamp getDtIncEsocial() {
        return this.getVo().asTimestamp("DTINC_ESOCIAL");
   }

   public void setDtIncEsocial(Timestamp dtIncEsocial) {
        markAsChanged("DTINC_ESOCIAL", dtIncEsocial);
   }

   public Timestamp getDtIniGrupoHr() {
        return this.getVo().asTimestamp("DTINIGRUPOHR");
   }

   public void setDtIniGrupoHr(Timestamp dtIniGrupoHr) {
        markAsChanged("DTINIGRUPOHR", dtIniGrupoHr);
   }

   public Timestamp getDtLaudoRra() {
        return this.getVo().asTimestamp("DTLAUDORRA");
   }

   public void setDtLaudoRra(Timestamp dtLaudoRra) {
        markAsChanged("DTLAUDORRA", dtLaudoRra);
   }

   public Timestamp getDtLoteNis() {
        return this.getVo().asTimestamp("DTLOTENIS");
   }

   public void setDtLoteNis(Timestamp dtLoteNis) {
        markAsChanged("DTLOTENIS", dtLoteNis);
   }

   public Timestamp getDtQuitacao() {
        return this.getVo().asTimestamp("DTQUITACAO");
   }

   public void setDtQuitacao(Timestamp dtQuitacao) {
        markAsChanged("DTQUITACAO", dtQuitacao);
   }

   public Timestamp getDtTermino() {
        return this.getVo().asTimestamp("DTTERMINO");
   }

   public void setDtTermino(Timestamp dtTermino) {
        markAsChanged("DTTERMINO", dtTermino);
   }

   public Timestamp getDtTransfDest() {
        return this.getVo().asTimestamp("DTTRANSFDEST");
   }

   public void setDtTransfDest(Timestamp dtTransfDest) {
        markAsChanged("DTTRANSFDEST", dtTransfDest);
   }

   public Timestamp getDtUltEnvEsocial() {
        return this.getVo().asTimestamp("DTULTENV_ESOCIAL");
   }

   public void setDtUltEnvEsocial(Timestamp dtUltEnvEsocial) {
        markAsChanged("DTULTENV_ESOCIAL", dtUltEnvEsocial);
   }

   public Timestamp getDtValOc() {
        return this.getVo().asTimestamp("DTVALOC");
   }

   public void setDtValOc(Timestamp dtValOc) {
        markAsChanged("DTVALOC", dtValOc);
   }

   public Timestamp getDtValPorte() {
        return this.getVo().asTimestamp("DTVALPPORTE");
   }

   public void setDtValPorte(Timestamp dtValPorte) {
        markAsChanged("DTVALPPORTE", dtValPorte);
   }

   public Timestamp getDtVencExp1Or() {
        return this.getVo().asTimestamp("DTVENCEXP1OR");
   }

   public void setDtVencExp1Or(Timestamp dtVencExp1Or) {
        markAsChanged("DTVENCEXP1OR", dtVencExp1Or);
   }

   public Timestamp getDtVencExp2Or() {
        return this.getVo().asTimestamp("DTVENCEXP2OR");
   }

   public void setDtVencExp2Or(Timestamp dtVencExp2Or) {
        markAsChanged("DTVENCEXP2OR", dtVencExp2Or);
   }

   public Timestamp getDtVincEmpAnt() {
        return this.getVo().asTimestamp("DTVINCEMPANT");
   }

   public void setDtVincEmpAnt(Timestamp dtVincEmpAnt) {
        markAsChanged("DTVINCEMPANT", dtVincEmpAnt);
   }

   public String getEmissorPorte() {
        return this.getVo().asString("EMISSORPPORTE");
   }

   public void setEmissorPorte(String emissorPorte) {
        markAsChanged("EMISSORPPORTE", emissorPorte);
   }

   public String getEnvEsocial() {
        return this.getVo().asString("ENVESOCIAL");
   }

   public void setEnvEsocial(String envEsocial) {
        markAsChanged("ENVESOCIAL", envEsocial);
   }

   public Timestamp getFimValeSocial() {
        return this.getVo().asTimestamp("FIMVALESOCIAL");
   }

   public void setFimValeSocial(Timestamp fimValeSocial) {
        markAsChanged("FIMVALESOCIAL", fimValeSocial);
   }

   public String getIdConsig() {
        return this.getVo().asString("IDCONSIG");
   }

   public void setIdConsig(String idConsig) {
        markAsChanged("IDCONSIG", idConsig);
   }

   public BigDecimal getIndCumprParc() {
        return this.getVo().asBigDecimal("INDCUMPRPARC");
   }

   public void setIndCumprParc(BigDecimal indCumprParc) {
        markAsChanged("INDCUMPRPARC", indCumprParc);
   }

   public BigDecimal getIndMv() {
        return this.getVo().asBigDecimal("INDMV");
   }

   public void setIndMv(BigDecimal indMv) {
        markAsChanged("INDMV", indMv);
   }

   public String getIndNif() {
        return this.getVo().asString("INDNIF");
   }

   public void setIndNif(String indNif) {
        markAsChanged("INDNIF", indNif);
   }

   public String getInfoCota() {
        return this.getVo().asString("INFOCOTA");
   }

   public void setInfoCota(String infoCota) {
        markAsChanged("INFOCOTA", infoCota);
   }

   public BigDecimal getInfoOnus() {
        return this.getVo().asBigDecimal("INFOONUS");
   }

   public void setInfoOnus(BigDecimal infoOnus) {
        markAsChanged("INFOONUS", infoOnus);
   }

   public Timestamp getIniValeSocial() {
        return this.getVo().asTimestamp("INIVALESOCIAL");
   }

   public void setIniValeSocial(Timestamp iniValeSocial) {
        markAsChanged("INIVALESOCIAL", iniValeSocial);
   }

   public String getInsConsig() {
        return this.getVo().asString("INSCONSIG");
   }

   public void setInsConsig(String insConsig) {
        markAsChanged("INSCONSIG", insConsig);
   }

   public String getJornadaEspProf() {
        return this.getVo().asString("JORNADAESPPROF");
   }

   public void setJornadaEspProf(String jornadaEspProf) {
        markAsChanged("JORNADAESPPROF", jornadaEspProf);
   }

   public BigDecimal getJornadaProf() {
        return this.getVo().asBigDecimal("JORNADAPROF");
   }

   public void setJornadaProf(BigDecimal jornadaProf) {
        markAsChanged("JORNADAPROF", jornadaProf);
   }

   public String getJustContr() {
        return this.getVo().asString("JUSTCONTR");
   }

   public void setJustContr(String justContr) {
        markAsChanged("JUSTCONTR", justContr);
   }

   public String getJustProrr() {
        return this.getVo().asString("JUSTPRORR");
   }

   public void setJustProrr(String justProrr) {
        markAsChanged("JUSTPRORR", justProrr);
   }

   public BigDecimal getMatricAnt() {
        return this.getVo().asBigDecimal("MATRICANT");
   }

   public void setMatricAnt(BigDecimal matricAnt) {
        markAsChanged("MATRICANT", matricAnt);
   }

   public String getMatriculaEmpAnt() {
        return this.getVo().asString("MATRICULAEMPANT");
   }

   public void setMatriculaEmpAnt(String matriculaEmpAnt) {
        markAsChanged("MATRICULAEMPANT", matriculaEmpAnt);
   }

   public String getMatriculaEmpCed() {
        return this.getVo().asString("MATRICULAEMPCED");
   }

   public void setMatriculaEmpCed(String matriculaEmpCed) {
        markAsChanged("MATRICULAEMPCED", matriculaEmpCed);
   }

   public String getMatriculaOld() {
        return this.getVo().asString("MATRICULAOLD");
   }

   public void setMatriculaOld(String matriculaOld) {
        markAsChanged("MATRICULAOLD", matriculaOld);
   }

   public String getMedicoAso() {
        return this.getVo().asString("MEDICOASO");
   }

   public void setMedicoAso(String medicoAso) {
        markAsChanged("MEDICOASO", medicoAso);
   }

   public String getMei() {
        return this.getVo().asString("MEI");
   }

   public void setMei(String mei) {
        markAsChanged("MEI", mei);
   }

   public String getMetErg() {
        return this.getVo().asString("METERG");
   }

   public void setMetErg(String metErg) {
        markAsChanged("METERG", metErg);
   }

   public BigDecimal getMtvDesligTsv() {
        return this.getVo().asBigDecimal("MTVDESLIGTSV");
   }

   public void setMtvDesligTsv(BigDecimal mtvDesligTsv) {
        markAsChanged("MTVDESLIGTSV", mtvDesligTsv);
   }

   public String getNifBenef() {
        return this.getVo().asString("NIFBENEF");
   }

   public void setNifBenef(String nifBenef) {
        markAsChanged("NIFBENEF", nifBenef);
   }

   public String getNisEnviado() {
        return this.getVo().asString("NISENVIADO");
   }

   public void setNisEnviado(String nisEnviado) {
        markAsChanged("NISENVIADO", nisEnviado);
   }

   public String getNmSocial() {
        return this.getVo().asString("NMSOCIAL");
   }

   public void setNmSocial(String nmSocial) {
        markAsChanged("NMSOCIAL", nmSocial);
   }

   public String getNomeArqHomologNet() {
        return this.getVo().asString("NOMEARQHOMOLOGNET");
   }

   public void setNomeArqHomologNet(String nomeArqHomologNet) {
        markAsChanged("NOMEARQHOMOLOGNET", nomeArqHomologNet);
   }

   public String getNovoEmprego() {
        return this.getVo().asString("NOVOEMPREGO");
   }

   public void setNovoEmprego(String novoEmprego) {
        markAsChanged("NOVOEMPREGO", novoEmprego);
   }

   public String getNrCertObito() {
        return this.getVo().asString("NRCERTOBITO");
   }

   public void setNrCertObito(String nrCertObito) {
        markAsChanged("NRCERTOBITO", nrCertObito);
   }

   public String getNrContr() {
        return this.getVo().asString("NRCONTR");
   }

   public void setNrContr(String nrContr) {
        markAsChanged("NRCONTR", nrContr);
   }

   public String getNrInscEstabVinc() {
        return this.getVo().asString("NRINSCESTABVINC");
   }

   public void setNrInscEstabVinc(String nrInscEstabVinc) {
        markAsChanged("NRINSCESTABVINC", nrInscEstabVinc);
   }

   public String getNrInscTomador() {
        return this.getVo().asString("NRINSCTOMADOR");
   }

   public void setNrInscTomador(String nrInscTomador) {
        markAsChanged("NRINSCTOMADOR", nrInscTomador);
   }

   public String getNroC() {
        return this.getVo().asString("NROC");
   }

   public void setNroC(String nroC) {
        markAsChanged("NROC", nroC);
   }

   public String getNroCertCivil() {
        return this.getVo().asString("NROCERTCIVIL");
   }

   public void setNroCertCivil(String nroCertCivil) {
        markAsChanged("NROCERTCIVIL", nroCertCivil);
   }

   public String getNroFolhaReg() {
        return this.getVo().asString("NROFOLHAREG");
   }

   public void setNroFolhaReg(String nroFolhaReg) {
        markAsChanged("NROFOLHAREG", nroFolhaReg);
   }

   public String getNroLivroReg() {
        return this.getVo().asString("NROLIVROREG");
   }

   public void setNroLivroReg(String nroLivroReg) {
        markAsChanged("NROLIVROREG", nroLivroReg);
   }

   public String getNroPassaporte() {
        return this.getVo().asString("NROPASSAPORTE");
   }

   public void setNroPassaporte(String nroPassaporte) {
        markAsChanged("NROPASSAPORTE", nroPassaporte);
   }

   public String getNroProcessoRra() {
        return this.getVo().asString("NROPROCESSORRA");
   }

   public void setNroProcessoRra(String nroProcessoRra) {
        markAsChanged("NROPROCESSORRA", nroProcessoRra);
   }

   public BigDecimal getNumLoteNis() {
        return this.getVo().asBigDecimal("NUMLOTENIS");
   }

   public void setNumLoteNis(BigDecimal numLoteNis) {
        markAsChanged("NUMLOTENIS", numLoteNis);
   }

   public BigDecimal getNuProcessoJud() {
        return this.getVo().asBigDecimal("NUPROCESSOJUD");
   }

   public void setNuProcessoJud(BigDecimal nuProcessoJud) {
        markAsChanged("NUPROCESSOJUD", nuProcessoJud);
   }

   public BigDecimal getNuProcessoTrab() {
        return this.getVo().asBigDecimal("NUPROCESSOTRAB");
   }

   public void setNuProcessoTrab(BigDecimal nuProcessoTrab) {
        markAsChanged("NUPROCESSOTRAB", nuProcessoTrab);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public String getObjDet() {
        return this.getVo().asString("OBJDET");
   }

   public void setObjDet(String objDet) {
        markAsChanged("OBJDET", objDet);
   }

   public String getObsAltCpf() {
        return this.getVo().asString("OBSALTCPF");
   }

   public void setObsAltCpf(String obsAltCpf) {
        markAsChanged("OBSALTCPF", obsAltCpf);
   }

   public String getObsEmpAnt() {
        return this.getVo().asString("OBSEMPANT");
   }

   public void setObsEmpAnt(String obsEmpAnt) {
        markAsChanged("OBSEMPANT", obsEmpAnt);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getObsVariavel() {
        return this.getVo().asString("OBSVARIAVEL");
   }

   public void setObsVariavel(String obsVariavel) {
        markAsChanged("OBSVARIAVEL", obsVariavel);
   }

   public String getCnpjEmpCed() {
        return this.getVo().asString("CNPJEMPCED");
   }

   public void setCnpjEmpCed(String cnpjEmpCed) {
        markAsChanged("CNPJEMPCED", cnpjEmpCed);
   }

   public BigDecimal getOrdemGrupoHr() {
        return this.getVo().asBigDecimal("ORDEMGRUPOHR");
   }

   public void setOrdemGrupoHr(BigDecimal ordemGrupoHr) {
        markAsChanged("ORDEMGRUPOHR", ordemGrupoHr);
   }

   public String getOrgaoOc() {
        return this.getVo().asString("ORGAOOC");
   }

   public void setOrgaoOc(String orgaoOc) {
        markAsChanged("ORGAOOC", orgaoOc);
   }

   public BigDecimal getPercInsal() {
        return this.getVo().asBigDecimal("PERCINSAL");
   }

   public void setPercInsal(BigDecimal percInsal) {
        markAsChanged("PERCINSAL", percInsal);
   }

   public BigDecimal getPercPeric() {
        return this.getVo().asBigDecimal("PERCPERIC");
   }

   public void setPercPeric(BigDecimal percPeric) {
        markAsChanged("PERCPERIC", percPeric);
   }

   public String getPertenceDp() {
        return this.getVo().asString("PERTENCEDP");
   }

   public void setPertenceDp(String pertenceDp) {
        markAsChanged("PERTENCEDP", pertenceDp);
   }

   public String getPossuiRra() {
        return this.getVo().asString("POSSUIRRA");
   }

   public void setPossuiRra(String possuiRra) {
        markAsChanged("POSSUIRRA", possuiRra);
   }

   public String getProvisao13() {
        return this.getVo().asString("PROVISAO13");
   }

   public void setProvisao13(String provisao13) {
        markAsChanged("PROVISAO13", provisao13);
   }

   public String getProvisaoFerias() {
        return this.getVo().asString("PROVISAOFERIAS");
   }

   public void setProvisaoFerias(String provisaoFerias) {
        markAsChanged("PROVISAOFERIAS", provisaoFerias);
   }

   public BigDecimal getQuemPagaRra() {
        return this.getVo().asBigDecimal("QUEMPAGARRA");
   }

   public void setQuemPagaRra(BigDecimal quemPagaRra) {
        markAsChanged("QUEMPAGARRA", quemPagaRra);
   }

   public String getReciboEsocial() {
        return this.getVo().asString("RECIBOESOCIAL");
   }

   public void setReciboEsocial(String reciboEsocial) {
        markAsChanged("RECIBOESOCIAL", reciboEsocial);
   }

   public BigDecimal getRemunBase() {
        return this.getVo().asBigDecimal("REMUNBASE");
   }

   public void setRemunBase(BigDecimal remunBase) {
        markAsChanged("REMUNBASE", remunBase);
   }

   public BigDecimal getRemuneracaoMesAnt() {
        return this.getVo().asBigDecimal("REMUNERAMESANT");
   }

   public void setRemuneracaoMesAnt(BigDecimal remuneracaoMesAnt) {
        markAsChanged("REMUNERAMESANT", remuneracaoMesAnt);
   }

   public BigDecimal getSalAjustadoSind() {
        return this.getVo().asBigDecimal("SALAJUSTADOSIND");
   }

   public void setSalAjustadoSind(BigDecimal salAjustadoSind) {
        markAsChanged("SALAJUSTADOSIND", salAjustadoSind);
   }

   public BigDecimal getSalBaseAnterior() {
        return this.getVo().asBigDecimal("SALBASEANTERIOR");
   }

   public void setSalBaseAnterior(BigDecimal salBaseAnterior) {
        markAsChanged("SALBASEANTERIOR", salBaseAnterior);
   }

   public BigDecimal getSalProfessor() {
        return this.getVo().asBigDecimal("SALPROFESSOR");
   }

   public void setSalProfessor(BigDecimal salProfessor) {
        markAsChanged("SALPROFESSOR", salProfessor);
   }

   public String getSegDesemprego() {
        return this.getVo().asString("SEGDESEMPREGO");
   }

   public void setSegDesemprego(String segDesemprego) {
        markAsChanged("SEGDESEMPREGO", segDesemprego);
   }

   public BigDecimal getSemanasPorMes() {
        return this.getVo().asBigDecimal("SEMANASPORMES");
   }

   public void setSemanasPorMes(BigDecimal semanasPorMes) {
        markAsChanged("SEMANASPORMES", semanasPorMes);
   }

   public String getSemIntegral() {
        return this.getVo().asString("SEMINTEGRAL");
   }

   public void setSemIntegral(String semIntegral) {
        markAsChanged("SEMINTEGRAL", semIntegral);
   }

   public String getSitEsocial() {
        return this.getVo().asString("SITESOCIAL");
   }

   public void setSitEsocial(String sitEsocial) {
        markAsChanged("SITESOCIAL", sitEsocial);
   }

   public String getStep() {
        return this.getVo().asString("STEP");
   }

   public void setStep(String step) {
        markAsChanged("STEP", step);
   }

   public String getSuspExpAfast() {
        return this.getVo().asString("SUSPEXPAFAST");
   }

   public void setSuspExpAfast(String suspExpAfast) {
        markAsChanged("SUSPEXPAFAST", suspExpAfast);
   }

   public String getTelMedicoAso() {
        return this.getVo().asString("TELMEDICOASO");
   }

   public void setTelMedicoAso(String telMedicoAso) {
        markAsChanged("TELMEDICOASO", telMedicoAso);
   }

   public String getTemContribSindical() {
        return this.getVo().asString("TEMCONTRIBSINDICAL");
   }

   public void setTemContribSindical(String temContribSindical) {
        markAsChanged("TEMCONTRIBSINDICAL", temContribSindical);
   }

   public String getTemDescAssist() {
        return this.getVo().asString("TEMDESCASSIST");
   }

   public void setTemDescAssist(String temDescAssist) {
        markAsChanged("TEMDESCASSIST", temDescAssist);
   }

   public String getTempoParcial() {
        return this.getVo().asString("TEMPOPARCIAL");
   }

   public void setTempoParcial(String tempoParcial) {
        markAsChanged("TEMPOPARCIAL", tempoParcial);
   }

   public String getTipCertidao() {
        return this.getVo().asString("TIPCERTIDAO");
   }

   public void setTipCertidao(String tipCertidao) {
        markAsChanged("TIPCERTIDAO", tipCertidao);
   }

   public BigDecimal getTpInclContr() {
        return this.getVo().asBigDecimal("TPINCLCONTR");
   }

   public void setTpInclContr(BigDecimal tpInclContr) {
        markAsChanged("TPINCLCONTR", tpInclContr);
   }

   public BigDecimal getTpInscEstabVinc() {
        return this.getVo().asBigDecimal("TPINSCESTABVINC");
   }

   public void setTpInscEstabVinc(BigDecimal tpInscEstabVinc) {
        markAsChanged("TPINSCESTABVINC", tpInscEstabVinc);
   }

   public BigDecimal getTpInscTomador() {
        return this.getVo().asBigDecimal("TPINSCTOMADOR");
   }

   public void setTpInscTomador(BigDecimal tpInscTomador) {
        markAsChanged("TPINSCTOMADOR", tpInscTomador);
   }

   public BigDecimal getTpRegPrevCed() {
        return this.getVo().asBigDecimal("TPREGPREVCED");
   }

   public void setTpRegPrevCed(BigDecimal tpRegPrevCed) {
        markAsChanged("TPREGPREVCED", tpRegPrevCed);
   }

   public BigDecimal getTpRegTrabCed() {
        return this.getVo().asBigDecimal("TPREGTRABCED");
   }

   public void setTpRegTrabCed(BigDecimal tpRegTrabCed) {
        markAsChanged("TPREGTRABCED", tpRegTrabCed);
   }

   public String getTrabAposent() {
        return this.getVo().asString("TRABAPOSENT");
   }

   public void setTrabAposent(String trabAposent) {
        markAsChanged("TRABAPOSENT", trabAposent);
   }

   public String getUfCrmMedAso() {
        return this.getVo().asString("UFCRMMEDASO");
   }

   public void setUfCrmMedAso(String ufCrmMedAso) {
        markAsChanged("UFCRMMEDASO", ufCrmMedAso);
   }

   public BigDecimal getUfPorte() {
        return this.getVo().asBigDecimal("UFPPORTE");
   }

   public void setUfPorte(BigDecimal ufPorte) {
        markAsChanged("UFPPORTE", ufPorte);
   }

   public BigDecimal getCodCategEsocial() {
        return this.getVo().asBigDecimal("CODCATEGESOCIAL");
   }

   public void setCodCategEsocial(BigDecimal codCategEsocial) {
        markAsChanged("CODCATEGESOCIAL", codCategEsocial);
   }

   public BigDecimal getCodCidRic() {
        return this.getVo().asBigDecimal("CODCIDRIC");
   }

   public void setCodCidRic(BigDecimal codCidRic) {
        markAsChanged("CODCIDRIC", codCidRic);
   }

   public String getComplementoRg() {
        return this.getVo().asString("COMPLEMENTORG");
   }

   public void setComplementoRg(String complementoRg) {
        markAsChanged("COMPLEMENTORG", complementoRg);
   }

   public Timestamp getDtEmiRic() {
        return this.getVo().asTimestamp("DTEMIRIC");
   }

   public void setDtEmiRic(Timestamp dtEmiRic) {
        markAsChanged("DTEMIRIC", dtEmiRic);
   }

   public Timestamp getDtExpCnh() {
        return this.getVo().asTimestamp("DTEXPCNH");
   }

   public void setDtExpCnh(Timestamp dtExpCnh) {
        markAsChanged("DTEXPCNH", dtExpCnh);
   }

   public String getNroRic() {
        return this.getVo().asString("NRORIC");
   }

   public void setNroRic(String nroRic) {
        markAsChanged("NRORIC", nroRic);
   }

   public String getOrgaoRic() {
        return this.getVo().asString("ORGAORIC");
   }

   public void setOrgaoRic(String orgaoRic) {
        markAsChanged("ORGAORIC", orgaoRic);
   }

   public BigDecimal getUfCnh() {
        return this.getVo().asBigDecimal("UFCNH");
   }

   public void setUfCnh(BigDecimal ufCnh) {
        markAsChanged("UFCNH", ufCnh);
   }

   public BigDecimal getUfRg() {
        return this.getVo().asBigDecimal("UFRG");
   }

   public void setUfRg(BigDecimal ufRg) {
        markAsChanged("UFRG", ufRg);
   }

   public BigDecimal getUsuVpjSup() {
        return this.getVo().asBigDecimal("USUVPJSUP");
   }

   public void setUsuVpjSup(BigDecimal usuVpjSup) {
        markAsChanged("USUVPJSUP", usuVpjSup);
   }

   public String getAprendizGravida() {
        return this.getVo().asString("APRENDIZGRAVIDA");
   }

   public void setAprendizGravida(String aprendizGravida) {
        markAsChanged("APRENDIZGRAVIDA", aprendizGravida);
   }

   public String getCadIni() {
        return this.getVo().asString("CADINI");
   }

   public void setCadIni(String cadIni) {
        markAsChanged("CADINI", cadIni);
   }

   public String getCagedAdm() {
        return this.getVo().asString("CAGEDADM");
   }

   public void setCagedAdm(String cagedAdm) {
        markAsChanged("CAGEDADM", cagedAdm);
   }

   public String getCaixaPostal() {
        return this.getVo().asString("CAIXAPOSTAL");
   }

   public void setCaixaPostal(String caixaPostal) {
        markAsChanged("CAIXAPOSTAL", caixaPostal);
   }

   public String getCartorio() {
        return this.getVo().asString("CARTORIO");
   }

   public void setCartorio(String cartorio) {
        markAsChanged("CARTORIO", cartorio);
   }

   public String getCnpjDestTransf() {
        return this.getVo().asString("CNPJDESTTRANSF");
   }

   public void setCnpjDestTransf(String cnpjDestTransf) {
        markAsChanged("CNPJDESTTRANSF", cnpjDestTransf);
   }

   public String getCnpjEmpAnt() {
        return this.getVo().asString("CNPJEMPANT");
   }

   public void setCnpjEmpAnt(String cnpjEmpAnt) {
        markAsChanged("CNPJEMPANT", cnpjEmpAnt);
   }

   public BigDecimal getCodPaisNac() {
        return this.getVo().asBigDecimal("CODPAISNAC");
   }

   public void setCodPaisNac(BigDecimal codPaisNac) {
        markAsChanged("CODPAISNAC", codPaisNac);
   }

   public Timestamp getDtFimRemun() {
        return this.getVo().asTimestamp("DTFIMREMUN");
   }

   public void setDtFimRemun(Timestamp dtFimRemun) {
        markAsChanged("DTFIMREMUN", dtFimRemun);
   }

   public String getEndFiscExt() {
        return this.getVo().asString("ENDFISCEXT");
   }

   public void setEndFiscExt(String endFiscExt) {
        markAsChanged("ENDFISCEXT", endFiscExt);
   }

   public BigDecimal getFormTribu() {
        return this.getVo().asBigDecimal("FORMTRIBU");
   }

   public void setFormTribu(BigDecimal formTribu) {
        markAsChanged("FORMTRIBU", formTribu);
   }

   public BigDecimal getIndSitRemunDeslig() {
        return this.getVo().asBigDecimal("INDSITREMUNDESLIG");
   }

   public void setIndSitRemunDeslig(BigDecimal indSitRemunDeslig) {
        markAsChanged("INDSITREMUNDESLIG", indSitRemunDeslig);
   }

   public BigDecimal getMotExpatriado() {
        return this.getVo().asBigDecimal("MOTEXPATRIADO");
   }

   public void setMotExpatriado(BigDecimal motExpatriado) {
        markAsChanged("MOTEXPATRIADO", motExpatriado);
   }

   public String getCondIngEstrang() {
        return this.getVo().asString("CONDINGESTRANG");
   }

   public void setCondIngEstrang(String condIngEstrang) {
        markAsChanged("CONDINGESTRANG", condIngEstrang);
   }

   public String getTmpResidTrabEstrang() {
        return this.getVo().asString("TMPRESIDTRABESTRANG");
   }

   public void setTmpResidTrabEstrang(String tmpResidTrabEstrang) {
        markAsChanged("TMPRESIDTRABESTRANG", tmpResidTrabEstrang);
   }

   public String getNumProcTsvE() {
        return this.getVo().asString("NUMPROCTSVE");
   }

   public void setNumProcTsvE(String numProcTsvE) {
        markAsChanged("NUMPROCTSVE", numProcTsvE);
   }

   public String getTransfExterna() {
        return this.getVo().asString("TRANSFEXTERNA");
   }

   public void setTransfExterna(String transfExterna) {
        markAsChanged("TRANSFEXTERNA", transfExterna);
   }

   public String getCtpsDigital() {
        return this.getVo().asString("CTPSDIGITAL");
   }

   public void setCtpsDigital(String ctpsDigital) {
        markAsChanged("CTPSDIGITAL", ctpsDigital);
   }

   public String getSituacaoAnt() {
        return this.getVo().asString("SITUACAOANT");
   }

   public void setSituacaoAnt(String situacaoAnt) {
        markAsChanged("SITUACAOANT", situacaoAnt);
   }

   public String getAcessoPortalRh() {
        return this.getVo().asString("ACESSOPORTALRH");
   }

   public void setAcessoPortalRh(String acessoPortalRh) {
        markAsChanged("ACESSOPORTALRH", acessoPortalRh);
   }

   public String getAfastFgtsAnt() {
        return this.getVo().asString("AFASTFGTSANT");
   }

   public void setAfastFgtsAnt(String afastFgtsAnt) {
        markAsChanged("AFASTFGTSANT", afastFgtsAnt);
   }

   public BigDecimal getAfastRaisAnt() {
        return this.getVo().asBigDecimal("AFASTRAISANT");
   }

   public void setAfastRaisAnt(BigDecimal afastRaisAnt) {
        markAsChanged("AFASTRAISANT", afastRaisAnt);
   }

   public BigDecimal getCausaAfastAnt() {
        return this.getVo().asBigDecimal("CAUSAAFASTANT");
   }

   public void setCausaAfastAnt(BigDecimal causaAfastAnt) {
        markAsChanged("CAUSAAFASTANT", causaAfastAnt);
   }

   public String getCnpjEntQual() {
        return this.getVo().asString("CNPJENTQUAL");
   }

   public void setCnpjEntQual(String cnpjEntQual) {
        markAsChanged("CNPJENTQUAL", cnpjEntQual);
   }

   public String getCnpjPrat() {
        return this.getVo().asString("CNPJPRAT");
   }

   public void setCnpjPrat(String cnpjPrat) {
        markAsChanged("CNPJPRAT", cnpjPrat);
   }

   public BigDecimal getCodCategEsocialAnt() {
        return this.getVo().asBigDecimal("CODCATEGESOCIALANT");
   }

   public void setCodCategEsocialAnt(BigDecimal codCategEsocialAnt) {
        markAsChanged("CODCATEGESOCIALANT", codCategEsocialAnt);
   }

   public BigDecimal getCodTprJud() {
        return this.getVo().asBigDecimal("CODTPRJUD");
   }

   public void setCodTprJud(BigDecimal codTprJud) {
        markAsChanged("CODTPRJUD", codTprJud);
   }

   public BigDecimal getCodUsuSnk() {
        return this.getVo().asBigDecimal("CODUSUSNK");
   }

   public void setCodUsuSnk(BigDecimal codUsuSnk) {
        markAsChanged("CODUSUSNK", codUsuSnk);
   }

   public Timestamp getDtAdmJud() {
        return this.getVo().asTimestamp("DTADMJUD");
   }

   public void setDtAdmJud(Timestamp dtAdmJud) {
        markAsChanged("DTADMJUD", dtAdmJud);
   }

   public Timestamp getDtAltS2200() {
        return this.getVo().asTimestamp("DTALTS2200");
   }

   public void setDtAltS2200(Timestamp dtAltS2200) {
        markAsChanged("DTALTS2200", dtAltS2200);
   }

   public Timestamp getDtAltS2299() {
        return this.getVo().asTimestamp("DTALTS2299");
   }

   public void setDtAltS2299(Timestamp dtAltS2299) {
        markAsChanged("DTALTS2299", dtAltS2299);
   }

   public Timestamp getDtDemJud() {
        return this.getVo().asTimestamp("DTDEMJUD");
   }

   public void setDtDemJud(Timestamp dtDemJud) {
        markAsChanged("DTDEMJUD", dtDemJud);
   }

   public Timestamp getDtSentProcTrab() {
        return this.getVo().asTimestamp("DTSENTPROCTRAB");
   }

   public void setDtSentProcTrab(Timestamp dtSentProcTrab) {
        markAsChanged("DTSENTPROCTRAB", dtSentProcTrab);
   }

   public String getIdentidadeGenero() {
        return this.getVo().asString("IDENTIDADEGENERO");
   }

   public void setIdentidadeGenero(String identidadeGenero) {
        markAsChanged("IDENTIDADEGENERO", identidadeGenero);
   }

   public BigDecimal getIndAdmissaoAnt() {
        return this.getVo().asBigDecimal("INDADMISSAOANT");
   }

   public void setIndAdmissaoAnt(BigDecimal indAdmissaoAnt) {
        markAsChanged("INDADMISSAOANT", indAdmissaoAnt);
   }

   public String getMatAnotJud() {
        return this.getVo().asString("MATANOTJUD");
   }

   public void setMatAnotJud(String matAnotJud) {
        markAsChanged("MATANOTJUD", matAnotJud);
   }

   public String getMotDesligEsocial() {
        return this.getVo().asString("MOTDESLIGESOCIAL");
   }

   public void setMotDesligEsocial(String motDesligEsocial) {
        markAsChanged("MOTDESLIGESOCIAL", motDesligEsocial);
   }

   public String getMotDesligEsocialAnt() {
        return this.getVo().asString("MOTDESLIGESOCIALANT");
   }

   public void setMotDesligEsocialAnt(String motDesligEsocialAnt) {
        markAsChanged("MOTDESLIGESOCIALANT", motDesligEsocialAnt);
   }

   public String getNatAtividade() {
        return this.getVo().asString("NATATIVIDADE");
   }

   public void setNatAtividade(String natAtividade) {
        markAsChanged("NATATIVIDADE", natAtividade);
   }

   public String getNatAtividadeAnt() {
        return this.getVo().asString("NATATIVIDADEANT");
   }

   public void setNatAtividadeAnt(String natAtividadeAnt) {
        markAsChanged("NATATIVIDADEANT", natAtividadeAnt);
   }

   public String getNrInscAprend() {
        return this.getVo().asString("NRINSCAPREND");
   }

   public void setNrInscAprend(String nrInscAprend) {
        markAsChanged("NRINSCAPREND", nrInscAprend);
   }

   public String getNrProcTrabAnt() {
        return this.getVo().asString("NRPROCTRABANT");
   }

   public void setNrProcTrabAnt(String nrProcTrabAnt) {
        markAsChanged("NRPROCTRABANT", nrProcTrabAnt);
   }

   public String getNrProcTrabDeslig() {
        return this.getVo().asString("NRPROCTRABDESLIG");
   }

   public void setNrProcTrabDeslig(String nrProcTrabDeslig) {
        markAsChanged("NRPROCTRABDESLIG", nrProcTrabDeslig);
   }

   public String getOrientacaoSexual() {
        return this.getVo().asString("ORIENTACAOSEXUAL");
   }

   public void setOrientacaoSexual(String orientacaoSexual) {
        markAsChanged("ORIENTACAOSEXUAL", orientacaoSexual);
   }

   public String getPossuiFilhos() {
        return this.getVo().asString("POSSUIFILHOS");
   }

   public void setPossuiFilhos(String possuiFilhos) {
        markAsChanged("POSSUIFILHOS", possuiFilhos);
   }

   public String getPvd() {
        return this.getVo().asString("PVD");
   }

   public void setPvd(String pvd) {
        markAsChanged("PVD", pvd);
   }

   public String getReciboEsocial2200() {
        return this.getVo().asString("RECIBOESOCIAL2200");
   }

   public void setReciboEsocial2200(String reciboEsocial2200) {
        markAsChanged("RECIBOESOCIAL2200", reciboEsocial2200);
   }

   public String getReciboEsocial2205() {
        return this.getVo().asString("RECIBOESOCIAL2205");
   }

   public void setReciboEsocial2205(String reciboEsocial2205) {
        markAsChanged("RECIBOESOCIAL2205", reciboEsocial2205);
   }

   public String getReciboEsocial2206() {
        return this.getVo().asString("RECIBOESOCIAL2206");
   }

   public void setReciboEsocial2206(String reciboEsocial2206) {
        markAsChanged("RECIBOESOCIAL2206", reciboEsocial2206);
   }

   public String getTemUsuSnk() {
        return this.getVo().asString("TEMUSUSNK");
   }

   public void setTemUsuSnk(String temUsuSnk) {
        markAsChanged("TEMUSUSNK", temUsuSnk);
   }

   public BigDecimal getTpInscAprend() {
        return this.getVo().asBigDecimal("TPINSCAPREND");
   }

   public void setTpInscAprend(BigDecimal tpInscAprend) {
        markAsChanged("TPINSCAPREND", tpInscAprend);
   }

   public String getNrProcTrab() {
        return this.getVo().asString("NRPROCTRAB");
   }

   public void setNrProcTrab(String nrProcTrab) {
        markAsChanged("NRPROCTRAB", nrProcTrab);
   }

   public String getObservacaoMp() {
        return this.getVo().asString("OBSERVACAOMP");
   }

   public void setObservacaoMp(String observacaoMp) {
        markAsChanged("OBSERVACAOMP", observacaoMp);
   }

   public BigDecimal getPerRedCpu() {
        return this.getVo().asBigDecimal("PERREDCPU");
   }

   public void setPerRedCpu(BigDecimal perRedCpu) {
        markAsChanged("PERREDCPU", perRedCpu);
   }

   public String getReplider() {
        return this.getVo().asString("REPLIDER");
   }

   public void setReplider(String replider) {
        markAsChanged("REPLIDER", replider);
   }

   public BigDecimal getSalBaseCpu() {
        return this.getVo().asBigDecimal("SALBASECPU");
   }

   public void setSalBaseCpu(BigDecimal salBaseCpu) {
        markAsChanged("SALBASECPU", salBaseCpu);
   }

   public BigDecimal getSalBaseRed() {
        return this.getVo().asBigDecimal("SALBASERED");
   }

   public void setSalBaseRed(BigDecimal salBaseRed) {
        markAsChanged("SALBASERED", salBaseRed);
   }

   public String getSuspContrato() {
        return this.getVo().asString("SUSPCONTRATO");
   }

   public void setSuspContrato(String suspContrato) {
        markAsChanged("SUSPCONTRATO", suspContrato);
   }

   public Timestamp getDtDispensaPonto() {
        return this.getVo().asTimestamp("DTDISPENSAPONTO");
   }

   public void setDtDispensaPonto(Timestamp dtDispensaPonto) {
        markAsChanged("DTDISPENSAPONTO", dtDispensaPonto);
   }

   public BigDecimal getCodLocalPonto() {
        return this.getVo().asBigDecimal("CODLOCALPONTO");
   }

   public void setCodLocalPonto(BigDecimal codLocalPonto) {
        markAsChanged("CODLOCALPONTO", codLocalPonto);
   }

   public String getValidado() {
        return this.getVo().asString("VALIDADO");
   }

   public void setValidado(String validado) {
        markAsChanged("VALIDADO", validado);
   }

   public String getTransfSemOnusCedente() {
        return this.getVo().asString("TRANSFSEMONUSCEDENTE");
   }

   public void setTransfSemOnusCedente(String transfSemOnusCedente) {
        markAsChanged("TRANSFSEMONUSCEDENTE", transfSemOnusCedente);
   }

   @Override
   public String getTableName() {
        return "TFPFUN";
   }

   @Override
   public String getEntityName() {
        return "Funcionario";
   }

   @Override
   public Funcionario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
